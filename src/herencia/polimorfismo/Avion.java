package herencia.polimorfismo;

public class Avion extends Vehiculo implements Rodable{

	@Override
	public void identificarse() {
		System.out.println("Soy avion");

	}
	
	public String getModelo() {
		return "737";
	}

	@Override
	public String toString() {
		return super.toString() + " " + getModelo(); 
	}

	@Override
	public String tipoVehiculo() {
		return "AVION";
	}

	@Override
	public int hashCode() {
		return 123123;
	}

	@Override
	public void rodar() {
		System.out.println("Rueda avion");
		
	}

	
	
}
