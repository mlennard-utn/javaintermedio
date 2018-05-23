package poo;

import java.util.Calendar;

public abstract class Persona implements Facultable {

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	private String nombre;
	private String formula;
	
	public Persona(String nom, String form) {
		this.nombre = nom;
		this.formula = form;
	} 
	
	public String presentarse() {
		return this.formula + " " + this.nombre;
	}
	
	public abstract String saludar(String momentoDelDia);
	public abstract String saludar(int horaDelDia);
	public abstract String saludar();
	
	public String saludo() {
		String saludo = "Hola, soy ";
		saludo += saludar();
		saludo += " gracias por estar!";
		
		return saludo;
		
	}

	public void despedirse() {
		System.out.println(this.getNombre() + " se despide");
	}	

//	public abstract void despedidaFormal();
	public abstract String ingresar(Calendar cal);
	
	public void ingresarFacultad() {
		Calendar cal = Calendar.getInstance();
		System.out.println( ingresar(cal) );
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
