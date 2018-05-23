package herencia.polimorfismo;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		String[] nombres = {"Tobias", "Susana", "Diego", "Sebastian"};
		
		List<String> listaNombres = Arrays.asList(nombres);
		
		listaNombres.replaceAll(nombre -> darVuelta(nombre));
		
		System.out.println("Nombres en minuscula " + listaNombres);
	}

	private static String darVuelta(String v) {
		String vuelta = "";
		for (int i = v.length() -1 ; i >= 0; i--) {
			vuelta += v.charAt(i);
		}
		
		return vuelta;
	}	

}
