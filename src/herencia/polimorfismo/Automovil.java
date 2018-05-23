package herencia.polimorfismo;

public class Automovil extends Vehiculo implements Rodable {

	@Override
	public void rodar() {
		System.out.println("Rueda auto");

	}

	@Override
	public void identificarse() {
		System.out.println("AUTOMOVIL");

	}

	@Override
	public String tipoVehiculo() {
		
		return "AUTO";
	}

}
