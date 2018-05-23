package programa;

public class Ejercicio4 {
	public static void main(String[] args) {
		/**
		 * B tome el valor de C
C tome el valor de A
A tome el valor de D
D tome el valor de B (el valor inicial o el que posea?)
		 */
		int A = 12;
		int B = 23;
		int C = 45;
		int D = 78;
		int aux;
		
		aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;
		
		
	}
}
