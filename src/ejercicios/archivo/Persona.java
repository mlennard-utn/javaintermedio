package ejercicios.archivo;

public class Persona {
	
	private int edad;
	private String nombre;
	private String[] hobbies;
	
	@Override
	public String toString() {
		String _hobbies = "[";
		for (int i = 0; i < hobbies.length; i++) {
			_hobbies += "\"" + hobbies[i] + "\",";
		}
		_hobbies = _hobbies.substring(0, _hobbies.length()-1);
		_hobbies += "]";
		
		return "{edad:" + edad + ", nombre:" + nombre + ", hobbies:" + _hobbies + "}";
	}
	
	public int getEdad() {
		return edad - 10;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setEdad(35);
		p.setNombre("Pepe");
		String[] hob = {"voley","danza","cocina"};
		p.setHobbies(hob);
		System.out.println(  p.getEdad());
		System.out.println(p.toString());
		
	}
	
}
