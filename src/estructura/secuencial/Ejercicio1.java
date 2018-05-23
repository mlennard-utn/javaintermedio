package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int primero, segundo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = scan.nextLine();
		System.out.println("Introduce un entero");
		primero = scan.nextInt();
		System.out.println("Introduce otro entero");
		segundo = scan.nextInt();
		System.out.println(String.format("%s los valores que ingresaste son: primero %d y "
				+ "segundo fue %d",nombre, primero, segundo));
	}

}
