package poo;

import java.util.ArrayList;
import java.util.List;

public class PresentacionAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Facultable> nominaUTN = new ArrayList<Facultable>();
		
		int variableInt = 1123432;
		boolean someBool = variableInt < 1230;
		
		System.out.println(variableInt);
		
		Persona al = new Alumno("Pedro", "Sr");
		System.out.println( al.saludar() );
		System.out.println(al.saludo());
		al.despedirse();
		al.ingresarFacultad();
		nominaUTN.add(al);
		
		Persona prof = new Profesor("Martin", "Ing");
		System.out.println(prof.saludar());
		System.out.println(prof.saludo());
		prof.despedirse();
		prof.ingresarFacultad();
		nominaUTN.add(prof);
		
		for (Facultable facultable : nominaUTN) {
			System.out.println(facultable.getIdentificador());
		}
		
	}

}
