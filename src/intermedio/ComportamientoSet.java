package intermedio;

import java.util.HashSet;
import java.util.Set;

public class ComportamientoSet {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("Pepe", 16);
		u1.setGenero('M');
		Usuario u2 = new Usuario("Paula", 21);
		u2.setGenero('F');
		Usuario u3 = new Usuario("Mario", 34);
		u3.setGenero('m');
		
		Set<Usuario> usuarios = new HashSet<Usuario>();
			
		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u3);

		//usuarios.stream().forEach(System.out::println);
		
		Usuario u = null;
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
			switch (usuario.getGenero()) {
			case 'M' : case 'm':
				System.out.println("Es hombre");
				break;
			case 'F' : case 'f':
				System.out.println("Es mujer");
				break;
			default:
				System.out.println("Es indefinido");
			
			}
			
			if(usuario.getEdad() < 20 ) {
				System.out.println("Es joven");
			} else if(usuario.getEdad() < 30 ) {
				System.out.println("Es adulto");
			} else if (usuario.getEdad() < 65) {
				System.out.println("Es muy adulto");
			} else {
				System.out.println("Es un retirado");
			}
			
		}

	}

}
