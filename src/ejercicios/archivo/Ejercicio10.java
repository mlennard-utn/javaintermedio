package ejercicios.archivo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/*
 * Crear un fichero de texto con caracteres aleatorios.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int cont = 0, n, cantidad;

		System.out.println("Introduce número de caracteres: ");
		cantidad = sc.nextInt();

		try (PrintWriter salida = new PrintWriter("c:/prueba/caracteres.txt")) {

			while (cont < cantidad) {

				n = rnd.nextInt(255); // se obtiene un número

				// si el número corresponde a una letra o a un espacio se escribe en el fichero
				if ((Character.toUpperCase((char) n) >= 'A' && Character.toUpperCase((char) n) <= 'Z')
						|| ((char) n == ' ') || ((char) n == 'ñ') || ((char) n == 'Ñ')) {
					salida.print((char) n);
					cont++;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
