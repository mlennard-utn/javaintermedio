package programa;

public class Ejercicio2 {

	public static void main(String[] args) {
		/**
		 * declarar dos variables X e Y de tipo int, 
		 * dos variables N y M de tipo double
		 */

		int X,Y;
		double N = 12.5;
		double M = 23.1;
		X = 12;
		Y = 78;
		
		/*
		La suma  X + Y
		La diferencia  X – Y
		El producto  X * Y
		El cociente  X / Y
		El resto  X % Y
		*/
		System.out.println("sum "+ (X+Y));
		System.out.println("dif "+ (X-Y));
		System.out.println("prod "+ (X*Y));
		System.out.println("coc "+ (X/Y));
		System.out.println("resto "+ (X%Y));
		
		/*
		 * La suma  N + M
La diferencia  N – M
El producto  N * M
El cociente  N / M
El resto  N % M
		 */
		System.out.println("Idem para los doubles");
		System.out.println("sum "+ (N+M));
		System.out.println("dif "+ (N-M));
		System.out.println("prod "+ (N*M));
		System.out.println("coc "+ (N/M));
		System.out.println("resto "+ (N%M));
		
		/*
		 * La suma X + N
El cociente Y / M
El resto Y % M
		 */
		System.out.println("Operaciones mixtas");
		System.out.println("sum "+ (X+N));
		System.out.println("coc" + (Y/M));
		System.out.println("resto");
		
		/*
		 * El doble de cada variable
La suma de todas las variables
El producto de todas las variables
		 */
		System.out.println("Operando todas las variables");
		System.out.println(String.format("El doble de X %d, "
				+ "el de Y %d, el de N %f y el de M %f", X*2, Y*2, N*2, M*2) );
		System.out.println("La suma: " + (Y+X+M+N));
		System.out.println("El producto: " +(Y*X*M*N) );
		
		String nombre = "Martin";
		
		System.out.println(String.format("Hola %s, como estas hoy?", nombre));
		
	}

}
