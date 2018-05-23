package herencia.polimorfismo;

public class Barco extends Vehiculo {

	@Override
	public void moverse() {
		System.out.println("Barco - moverse");
	}
	
	public void flotar() {
		System.out.println("Flota");
	}

	@Override
	public void identificarse() {
		System.out.println("Soy barco");		
	}

	@Override
	public String tipoVehiculo() {
		return "BARCO";
	}
	
	
}
