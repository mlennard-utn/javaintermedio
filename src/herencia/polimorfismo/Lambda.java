package herencia.polimorfismo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lambda {

	public static void main(String[] args) {
	
		List<Integer> lista = getListaEnteros(10, 9);
		lista.replaceAll(item -> elevarAlCuadrado(item));
		System.out.println("Lista resultado de elevar al cuadrado");
		lista.forEach(e -> System.out.println(e));
		System.out.println("Remover solo los pares");
		
		lista.removeIf(elemento -> {
			if(elemento % 2 == 0) {
				System.out.println(elemento + " sera removido");
				return true;
			} 
			return false;} );
		
		System.out.println("Lista resultado de remover los pares");
		lista.forEach(System.out::println);
		//invertirNombres();
	}

	private static Integer elevarAlCuadrado(Integer item) {
		System.out.print(item + " cambia a: ");
		int value = (int) Math.pow(item, 2);
		System.out.println(value);
		return value;
	}

	private static void invertirNombres() {
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

	public static List<Integer> getListaEnteros(int cantidadElementos, int maximoRandom){
		List<Integer> lista = new ArrayList<Integer>(cantidadElementos);
		
		for(int i= 0; i < cantidadElementos ; i ++) {
			lista.add(new Random().nextInt(maximoRandom));
		}
		
		return lista;
	}
	
	
}
