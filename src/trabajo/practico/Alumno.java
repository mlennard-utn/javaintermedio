package trabajo.practico;

public class Alumno implements Comparable<Alumno>{
	
	private String dni;
	private String nombre;
	private char genero;
	private int nota1;
	private int nota2;
	private Double asistencia;
	
	public String validar() {
		String validacion = "";
		
		if(dni == null) {
			validacion += "DNI es requerido";
		}
		
		if(nombre == null) {
			validacion += "Nombre es requerido";
		}
		
		if( genero != 'M' || genero != 'F' ) {
			validacion += "El genero debe ser M o F";
		}
		//.. agregar validaciones de nota (entre 1 y 10) y asistencia
		//.. agregar validacion de asistencia no null
				
		if("".equals(validacion)) {
			validacion = "OK";
		}
		return validacion;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public double getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(double asistencia) {
		this.asistencia = asistencia;
	}
	public Double getPromedio() {
		return new Double((nota1 + nota2) / 2);
	}

	@Override
	public int compareTo(Alumno o) {
		return this.getPromedio().compareTo(o.getPromedio());
	}
	
	
}
