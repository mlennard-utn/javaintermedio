package herencia.polimorfismo;

public abstract class Vehiculo {

	public void moverse() {
		System.out.println("Vehiculo-moverse");
	}
	
	public abstract void identificarse();
	
	public abstract String tipoVehiculo();

	@Override
	public String toString() {
		return "toString de " + tipoVehiculo();
	}
	
	
	
}
