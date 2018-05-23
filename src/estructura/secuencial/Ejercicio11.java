package estructura.secuencial;

import java.util.Scanner;

/**
 * Programa que lea un número entero N de 5 cifras 
 * y muestre sus cifras desde el principio como en el ejemplo.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println("Ingrese un numero de 5 cifras:\n");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		numero = validarIngreso(numero, scan);
		//Validar que sean 5 digitos!!
		solucionCadena(numero);
		solucionEntero(numero);
		
	}

	private static int validarIngreso(int numero, Scanner scanner) {
		if(numero < 100000 && numero > 9999) {
			return numero;
		}else {
			System.out.println("El valor es incorrecto, "
					+ "re-ingrese un numero de 5 cifras");
			numero = scanner.nextInt();
			return validarIngreso(numero, scanner);
		}
		
	}

	public static void solucionEntero(int num) {
		
	}
	
	public static void solucionCadena(int num) {
		String cadena = ""+num;
		for (int i = 0; i < cadena.toCharArray().length; i++) {
			char digito = cadena.toCharArray()[i];
			System.out.println(digito);
		}
	}
	
}
