package estructura.condicional;

import java.util.Scanner;

/*
 * Programa que lea un carácter y compruebe si es un número 
 * (Carácter entre '0' y '9'). 
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		String input = "";
		System.out.println("Ingrese un caracter entre 0 y 9");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		String mensaje = "";
		mensaje += validarLongitudInput(input);
		mensaje += validarInput(input);
		if(mensaje.length()==0) {
			System.out.println("Esta todo bien!");
		} else {
			System.out.println(mensaje);
		}
		
	}

	private static String validarLongitudInput(String input) {
		if(input.length() > 1) {
			return "La longitud es mayor a 1 \n";
		} 
		return "";
	}

	public static String validarInput(String input){
		try {
			Integer integer = new Integer(input);
			if(integer >= 0 && integer < 10) {
				return "";
			}else {
				return "Es un numero invalido \n";
			}
			
		} catch (NumberFormatException e) {
			return "El caracter no es un numero \n";
		}
	}
	
}
