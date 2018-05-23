package poo;

import java.util.ArrayList;

public class TomadorDeLista {
	
	private ArrayList<Alumno> alumnos;
	
	public void tomarListaAlumnos() {
		for (Alumno alumno : alumnos) {
			alumno.presentarse();
		}
	}
	
}
