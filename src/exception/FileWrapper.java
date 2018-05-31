package exception;

import java.io.File;
import java.io.IOException;

public class FileWrapper {
	
	public void testCheckedException(String filePath) throws IOException  {
		File testFile = new File(filePath);
		testFile.createNewFile();
		
		System.out.println("testCheckedException: " + testFile.exists());
		
	}
	
	public boolean testCheckedExceptionCaught(String filePath) {
		
		File testFile = new File(filePath);
		try {
			testFile.createNewFile();
			System.out.println("testCheckedExceptionCaught: " + testFile.exists());
			return true;
		} catch (IOException|SecurityException e) {
			e.printStackTrace();
			return false;
		} 
		
	}
	
	public void testCheckedExceptionThrown(String filePath) throws FileWrapperException {
		File testFile = new File(filePath);
		try {
			testFile.createNewFile();
			System.out.println("testCheckedExceptionThrown: " + testFile.exists());
		} catch (IOException e) {
			e.printStackTrace();
			throw new FileWrapperException("Hubo un error de E/S, verificar el path");
		} catch (SecurityException e) {
			e.printStackTrace();
			throw new FileWrapperException("Hubo un error de Seguridad, "
					+ "verificar que tenga acceso/permisos en el path");
		}
	}
	
	public void testCheckedExceptionCaughtAndEaten(String filePath) {
		
		File testFile = new File(filePath);
		try {
			testFile.createNewFile();
			System.out.println("testCheckedExceptionCaughtAndEaten: " + testFile.exists());
		} catch (IOException|SecurityException e) {
			e.printStackTrace();
			//Informar a alguien que el archivo filePath no pudo ser creado
		} 
		
	}
	
	public void testCheckedExceptionAndConvertedIntoRuntime(String filePath) throws RuntimeException{
		
		File testFile = new File(filePath);
		try {
			testFile.createNewFile();
			System.out.println("testCheckedExceptionCaughtAndEaten: " + testFile.exists());
		} catch (IOException|SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
			//Informar a alguien que el archivo filePath no pudo ser creado
		} 
		
	}
	
	
}
