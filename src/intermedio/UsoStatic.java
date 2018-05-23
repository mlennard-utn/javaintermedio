package intermedio;

public class UsoStatic {

	public static void main(String[] args) {
		Remera.setTamanoSmall("Pequeña");
		
		Remera r1 = new Remera();
		r1.setColor("Verde");
		r1.mostrarCaracteristicasRemera();
		int algunValor = 12;
		cambiarColorRemera(r1, "Amarillo", algunValor);
		r1.mostrarCaracteristicasRemera();
		System.out.println(algunValor);
		Remera r2 = new Remera();
		r2.setColor("Azul");
		Remera.setTamanoSmall("Petit");
		r2.mostrarCaracteristicasRemera();
		cambiarColorRemera(r2, "Marron", algunValor);
		System.out.println(algunValor);
		r2.mostrarCaracteristicasRemera();

	}
	
	public static void cambiarColorRemera(Remera remera, String nuevoColor, int valor) {
		remera.setColor(nuevoColor);
		valor = valor * 2;
	}
	

}
