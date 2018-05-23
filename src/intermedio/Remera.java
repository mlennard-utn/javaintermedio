package intermedio;

import java.util.Random;

public class Remera {
	public static String tamanoSmall = Remera.S;
	public final static String S = "S";
	private String color;

	int itemId;
	
	public Remera() {
		setId();
	}
	
	private void setId() {
		Random random = new Random();
		itemId = random.nextInt();
	}
	
	public static void setTamanoSmall(String nuevoTamano) {
		tamanoSmall = nuevoTamano;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		mostrarCaracteristicasRemera();
	}
	
	public void mostrarCaracteristicasRemera() {
		System.out.println("Remera: " + tamanoSmall 
				+ " de color " + this.color);
	}
	
}
