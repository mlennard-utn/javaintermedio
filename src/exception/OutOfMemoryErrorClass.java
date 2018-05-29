package exception;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorClass {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();

		try {
			while(true) {
				
				lista.add("Elementooo");
				
				if(lista.size() % 1000000 == 0) {
					System.out.println("el multiplo de 1 millon: " + lista.size());
				}
				
			}
		} catch (OutOfMemoryError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		System.out.println("Termino el programa");
		
	}

}
