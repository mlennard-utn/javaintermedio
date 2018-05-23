package poo;

import java.util.Calendar;

public class Profesor extends Persona implements Comparable<Profesor> {

	private String cuit;
	private int edad;
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Profesor(String nom, String form) {
		super(nom, form);
		cuit = "20-3321321321-1";
	}

	@Override
	public String saludar() {
		String saludoProfesor = "Soy profesor, me llamo" + this.getNombre();
		return saludoProfesor;
	}

	@Override
	public String ingresar(Calendar cal) {
		String horaDia = cal.get(Calendar.HOUR_OF_DAY) + " _ " + cal.get(Calendar.DAY_OF_MONTH);
		return horaDia;
	}

	@Override
	public String saludar(String momentoDelDia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saludar(int horaDelDia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIdentificador() {
		return cuit;
	}

	@Override
	public int compareTo(Profesor arg0) {
		return edad - arg0.getEdad();
	}

}
