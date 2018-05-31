package exception;

import java.io.IOException;

public class FileWrapperMainClass {

	public static void main(String[] args) {
		FileWrapper test = new FileWrapper();
		String path = "c:\\prueba\\testfile1.txt";
		
		// El metodo lanza la exception sin capturarla
		try {
			test.testCheckedException(path);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		// El metodo captura la exception e informa si el archivo existe o no
		boolean testFile = test.testCheckedExceptionCaught(path);
		
		// El metodo captura la excepcion y la convierte en excepcion de negocio
		try {
			test.testCheckedExceptionThrown(path);
		} catch (FileWrapperException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		// El componente atrapa las excepciones y las gestiona por su cuenta sin informar errores.
		// Eventualmente tiene que tener un mecanismo donde informa el problema.
		test.testCheckedExceptionCaughtAndEaten(path);
		
		test.testCheckedExceptionAndConvertedIntoRuntime("saraza" + path);
		
	}

}
