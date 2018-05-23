package intermedio;

public class Condicionales {

	public static void main(String[] args) {
//		String message = "item";
//		int quantity = 0;
//		double cost = 12.4;
//		
//		if(quantity > 1) {
//			message = message + "s";
//		}
//		
//		boolean outOfStock = (quantity <= 0);
//		
//		if(outOfStock) {
//			System.out.println("Item unavailable");
//		}else {
//			System.out.println(message);
//			System.out.println(quantity * cost);
//		}
		
		
//		String[] names = {"Lucio", "Emiliano", "Julien", "Gaston"};
//		System.out.println("Tamaño names " + names.length);
//		System.out.println(names[0] + names[0].length());
//		System.out.println(names[1] + names[1].length());
//		System.out.println(names[2] + names[2].length());
//		System.out.println(names[3] + names[3].length());

		float float1 = 20.9f;
		String nombre = "Nombre,Apellido";
		
		int posicionComa = nombre.indexOf(',');
		System.out.println(nombre.substring(posicionComa+1));
	}

}
