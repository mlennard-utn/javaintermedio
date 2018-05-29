package exception;

public class ExceptionMainClass {

	public static void main(String[] args){
		
		InscriptorProfesores ins = new InscriptorProfesores();
		
		for (int i = 0; i < 80; i++) {
			try {
				ins.inscribirProfesor(i);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(String.format("El profesor con edad %d "
						+ "no puede ser inscripto", i) );
			}
		}
		//ins.mostrarProfesoresInscriptos();
			
	}

}
