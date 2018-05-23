package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		double centigrados;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la temperatura en grados Celsius");
		centigrados = scan.nextDouble();
		double farenheit = toFarenheit(centigrados, scan);
		System.out.println("Farenheit es: " + farenheit);
		
	}
	
	private static double toFarenheit(double cent, Scanner scan) {
		double base;
		System.out.println("Ingrese la base de conversion a farenheit (32 en gral)");
		base = scan.nextDouble();
		return base + (9 * cent / 5);
	}
	
	
	

}
