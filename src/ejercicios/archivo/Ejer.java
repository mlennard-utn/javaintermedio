package ejercicios.archivo;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class Ejer {

	public static void main(String[] args) {
		ArrayList<String> jugadores = new ArrayList<String>();
		String registro,jugador = null;
		int posicion=0;
		Random azar = new Random();
		//Defino archivo de datos
		Path file = Paths.get("C:\\prueba", "loteria.txt");
		//Defino bloque try con los recursos archivo de lectura y escritura
		try (BufferedReader archivoLectura =Files.newBufferedReader(file); 
				PrintWriter archivoEscritura = new PrintWriter("c:/prueba/resultado.txt")) {
			//Leo el primer registro
			registro = archivoLectura.readLine();
			//Mientras haya datos en el archivo ...
			while(registro != null) {
				//Si es posicion par ...
				if( posicion%2==0) {
					archivoEscritura.println(registro);
				}
				jugadores.add(registro.split(",")[1]);
				registro = archivoLectura.readLine();
				posicion++;
			}
			int posicionGanadora = azar.nextInt(posicion);
			archivoEscritura.write(String.format("GANADOR: [%d] : %s", 
								posicionGanadora,jugadores.get(posicionGanadora)));  
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
