package ejercios.arrays;

import java.util.Scanner;

/*
 * Tomar como parametro de programa el tamaño del array (N).
 * Solicitar el ingreso de N enteros al usuario.
 * Mostrar los valores al reves de como fueron ingresados.
 * 
 *  Por ejemplo:
 *  parametro del programa: 3
 *  Valores ingresados: 55 65 98
 *  
 *  Mostrar:
 *  98 65 55
 * 
 */
public class EjercicioCrearArray {

	public static void main(String[] args) {
		String N = args[0];
		Integer n = new Integer(N);
		
		int[] digitos = new int[n];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("ingrese un digito");
			int digito = scan.nextInt();
			digitos[i] = digito;
		}
		System.out.println("Al reves");
		
		for(int i = n -1; i >= 0; i--) {
			System.out.println(digitos[i]);
		}
		
		
		
	}

}
