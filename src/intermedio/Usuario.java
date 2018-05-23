package intermedio;

public class Usuario {
	private String nombre;
	private int edad;
	private char genero;

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Usuario(String name, int age) {
		nombre = name;
		this.edad = age;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean equals(Usuario u) {
		return u.getEdad() == this.getEdad();
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Usuario) {
			Usuario param = (Usuario) arg0;
			return this.nombre.equalsIgnoreCase(param.getNombre()) 
					&& this.edad == param.getEdad();
		} else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return this.getEdad()+this.getNombre().toLowerCase().hashCode();
	}

	@Override
	public String toString() {
		return this.nombre + " edad: " + this.getEdad();
	}
	
}
