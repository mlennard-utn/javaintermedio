package exception;

import java.util.ArrayList;
import java.util.List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class InscriptorProfesores {
	
	List<Integer> edadProfesores = new ArrayList<>();
	
	public void inscribirProfesor(int edadProfesor) throws ProfesorDemasiadoViejoException {
		if(edadProfesor > 74) {
			throw new ProfesorDemasiadoViejoException("La edad maxima es 74, "
					+ "edad ingresada: " + edadProfesor);
		}
		edadProfesores.add(edadProfesor);
	}
	
	public void mostrarProfesoresInscriptos() {
		this.edadProfesores.forEach(edad -> System.out.println(edad));
	}
	
	public void contarProfesores() {
		throw new NotImplementedException();
	}
	
}
