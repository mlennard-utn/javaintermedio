package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio8 {
	
	
	public static void main(String[] args) {
		double radio, volumen;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el radio de la esfera que le dire el volumen");
		radio = scan.nextDouble();
		volumen = solveVolume(radio);
		System.out.println("El volumen de la esfera es: "+ volumen);
		
	}

	private static double solveVolume(double radio) {
		double volume = 4 * Math.PI * Math.pow(radio, 3) / 3;
		return volume;
	}
}
