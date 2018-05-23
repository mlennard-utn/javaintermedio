package ejercicios.archivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeerArchivo {
    public static void main(String[] args) throws IOException {
    	Path file = Paths.get("C:\\prueba","mi primer archivo.txt");
    	ArrayList<String> lista = new ArrayList<String>();
    	try (BufferedReader reader = Files.newBufferedReader(file)) {
    	    String line = null;
    	    while ((line = reader.readLine()) != null) {
    	    	//El metodo split de String permite separar una cadena en un array de Strings
    	    	//en funcion al caracter que le indique como separador.
    	    	// En este caso uso coma ","
    	    	String[] fields = line.split(",");
    	    	lista.add(fields[1]);
    	    }
    	    
    	} catch (IOException x) {
    	    x.printStackTrace();
    	}
    	
    	// ArrayList posee un metodo que nos permite tomar ciertas posiciones de mi 
    	// estructura. Recordar que el primer parametro es la posicion inicial, el 
    	//segundo es la posicion final menos 1.
    	List<String> losMejoresDos = lista.subList(0, 2);
    	
    	//Iterator permite recorrer la estructura no importa como esta sea.
    	Iterator<String> iter = losMejoresDos.iterator();
    	while (iter.hasNext()) {
			String nombre = (String) iter.next();
			System.out.println(nombre);
		}
    	
    	
    	
    }
}
