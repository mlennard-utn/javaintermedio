package trabajo.practico;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("ERROR: El programa espera dos parametros.");
			System.out.println("Ejemplo Programa <pathArchivo> nota");
			System.exit(-1);
		} else {
			// validar que el path sea valido o exista y que el segundo parametro tambien exista/sea numerico
			
		}
		String pathArchivo = args[1];
		String nota = args[2];
		
		Path file = Paths.get(pathArchivo);
    	ArrayList<Alumno> lista = new ArrayList<Alumno>();
    	String resultadoValidacionCampo = "";
    	try (BufferedReader reader = Files.newBufferedReader(file)) {
    	    String line = null;
    	    while ((line = reader.readLine()) != null) {
    	    	String[] fields = line.split(",");
    	    	//Validar campos obligatorios o que esten todos presentes
    	    	resultadoValidacionCampo = validarCampos(fields);
    	    	if("OK".equals(resultadoValidacionCampo)) {
    	    		Alumno alumno = construirAlumno(fields);
    	    		lista.add(alumno);
    	    	} else { // Registro invalido, mandar al archivo bad
    	    		// Punto extra 2
    	    	}
    	    }
    	    
    	} catch (IOException x) {
    	    x.printStackTrace();
    	}
    	//Recorro lista de alumnos para validar y tomar estadisticas
    	ArrayList<Alumno> validos = new ArrayList<Alumno>();
    	for (Alumno alumno : lista) {
			if("OK".equals(alumno.validar())){
				validos.add(alumno);
			} else {
				
			}
		}
    	Estadistica estadistica = new Estadistica(validos);
    	estadistica.calcularAsistenciaPorGenero();
    	estadistica.mostrarResultados();
    	
	}

	private static Alumno construirAlumno(String[] fields) {
		Alumno alumno = new Alumno();
		alumno.setDni(fields[0]);
		alumno.setNombre(fields[1]);
		char genero = validarGenero(fields[2]);
		if(genero != ' ') {
			alumno.setGenero(genero);
		} else {
			//Informar que el contenido de genero es invalido
		}
		int nota1 = validarNota(fields[3]);
		if(nota1 != 0) {
			alumno.setNota1(nota1);
		} else {
			//Informar nota invalida
		}
		int nota2 = validarNota(fields[4]);
		if(nota2 != 0) {
			alumno.setNota2(nota2);
		} else {
			//Informar nota invalida
		}
		//Similar con el double
		double asistencia = validarAsistencia(fields[5]);
		//Si todo bien ...
		alumno.setAsistencia(asistencia);
		return alumno;
	}
	
	private static double validarAsistencia(String valor) {
		double resultado = 0;
		try {
			Double decimal = new Double(valor);
			resultado = decimal.doubleValue();
		} catch (NumberFormatException e ) {
			
		}
		return resultado;
	}

	private static int validarNota(String valor) {
		int resultado = 0;
		try {
			Integer entero = new Integer(valor);
			resultado = entero.intValue();
		} catch (NumberFormatException e ) {
			
		}
		return resultado;
	}
	
	private static char validarGenero(String valor) {
		if( valor.length() == 1 ) {
			return valor.charAt(0);
		}
		return ' ';
	}
	
	
	private static String validarCampos(String[] fields) {
		String validacion = "";
		if(fields.length != 6) {
			validacion = "Error linea, los campos esperados son 6 y hay " + fields.length + "\n"; 
		} else {
			for (int i = 0; i < fields.length; i++) {
				String string = fields[i];
				if(string == null) {
					validacion += "Se esperaba un dato en la posicion " + i + " del registro."; 
				}
			}
		}
		if("".equals(validacion)) {
			return "OK";
		} else {
			return validacion;
		}
		
	}

}
