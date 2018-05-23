package trabajo.practico;

import java.util.ArrayList;
import java.util.Collections;


public class Estadistica {

	private ArrayList<Alumno> listaAlumnos = null;
	private String asistenciaPorGenero = null; 
	private ArrayList<Alumno> listaMejores5Alumnos = new ArrayList<Alumno>();
	
	
	public Estadistica(ArrayList<Alumno> lista) {
		this.listaAlumnos = lista;
	}
	
	public void calcularAsistenciaPorGenero() {
		
		double asistenciaMasculina = 0.0;
		double asistenciaFemenina = 0.0;
		int asistentesMasculinos = 0;
		int asistentesFemeninos = 0;
		
		for (Alumno alumno : listaAlumnos) {
			if(alumno.getGenero()== 'M') {
				asistentesMasculinos++;
				asistenciaMasculina += alumno.getAsistencia();
			} else {
				asistenciaFemenina += alumno.getAsistencia();
				asistentesFemeninos++;
			}
		}
		String resultadoAsistenciaGenero = "Asistencia Femenina: " + (asistenciaFemenina/asistentesFemeninos);
		resultadoAsistenciaGenero += ", Asistencia Masculina: " + (asistenciaMasculina/asistentesMasculinos);
		
		this.asistenciaPorGenero = resultadoAsistenciaGenero;
	}
	
	public void calcular5MejoresPromedios() {
		Collections.sort(this.listaAlumnos);
		for (int i = 0; i < 5; i++) {
			this.listaMejores5Alumnos.add(i, this.listaAlumnos.get(i));
		}
		
	}
	
	
	public String mostrarResultados() {
		//Magia JSON u otro 
		
		return this.asistenciaPorGenero;
		
	}
}
