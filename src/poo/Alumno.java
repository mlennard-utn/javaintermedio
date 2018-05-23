package poo;

import java.util.Calendar;

public class Alumno extends Persona {

	private int dni;
	
	public Alumno(String nom, String form) {
		super(nom, form);
		dni = 123;
	}
	
	public String presentarse() {
		return "Alumno: " + super.presentarse();
	}
	
	public void aprender() {
		
	}

	@Override
	public String saludar(String momento) {
		String form = momento.equalsIgnoreCase("MAÑANA")?"Buenos dias":"Buenas tardes";
		int variable = 1_123_312;
		return form + " Soy alumno y me llamo: " + this.getNombre();
	}
	
	@Override
	public String saludar(int momento) {
		String form = momento < 12? "Buenos dias":"Buenas tardes";
		return form + " Soy alumno y me llamo: " + super.getNombre();
	}
	
	
	@Override
	public String saludar() {
		return "Hola, soy alumno y me llamo: " + this.getNombre();
	}

	@Override
	public void despedirse() {
		//super.despedirse();
		System.out.println("CHAU!");
	}

	@Override
	public String ingresar(Calendar cal) {
		String dia = "" + cal.get(Calendar.DAY_OF_MONTH);
		return dia;
	}

	@Override
	public String getIdentificador() {
		return ""+ dni;
		
	}


	

	
}
