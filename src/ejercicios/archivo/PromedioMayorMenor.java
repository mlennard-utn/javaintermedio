package ejercicios.archivo;

import java.util.ArrayList;
import java.util.Iterator;

public class PromedioMayorMenor {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(12);
		lista.add(14);
		lista.add(18);
		lista.add(11);
		
		Integer menor = null;
		Integer mayor = null;
		Integer suma = 0;
		
		Iterator<Integer> iter = lista.iterator();
		while (iter.hasNext()) {
			Integer integer = (Integer) iter.next();
			if(menor == null || integer < menor) {
				menor = integer;
			}
			if(mayor == null || integer > mayor) {
				mayor = integer;
			}
			suma += integer;
		}
		System.out.println("Promedio " + suma / lista.size() );
		System.out.println("Mayor " + mayor);
		System.out.println("Menor " + menor);
	}

}
