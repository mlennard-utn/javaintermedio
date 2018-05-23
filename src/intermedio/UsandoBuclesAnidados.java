package intermedio;

import java.util.Random;

import poo.Alumno;
import poo.Persona;

public class UsandoBuclesAnidados {

	public static void main(String[] args) {
		int[][] matrix = new int[4][5];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = new Random().nextInt(100);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("("+ i + "," + j +"):"+ matrix[i][j] );
			}
			System.out.println();
		}
		
		
		Persona p1 = new Alumno("Pepe", "Sr");
		

	}

}
