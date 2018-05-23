package herencia.polimorfismo;

import java.util.Arrays;
import java.util.List;

public class Herencia {

	public static void main(String[] args) {
		Vehiculo[] vehiculos = {new Barco(), new Barco(), new Avion(), new Automovil()};
		List<Vehiculo> listaVehiculos = Arrays.asList(vehiculos);
		
		listaVehiculos.replaceAll( veh -> new Barco());
		
		for (Vehiculo vehiculo : listaVehiculos) {
			vehiculo.identificarse();
			if(vehiculo instanceof Barco) {
				((Barco)vehiculo).flotar();
			} else {
				vehiculo.moverse();
			}	
			
			if(vehiculo instanceof Rodable) {
				((Rodable) vehiculo).rodar();
			}
			
			System.out.println(vehiculo);
			System.out.println("------------------");
		}
		
	}

}
