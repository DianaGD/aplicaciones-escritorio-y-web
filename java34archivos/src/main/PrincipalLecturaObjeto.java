package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PrincipalLecturaObjeto {
	public static void main(String[] args) {		
		try {
			FileInputStream fis = new FileInputStream("datos.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Jugador jLeido = (Jugador) ois.readObject();
			System.out.println(jLeido.toString());
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end main
}//end class
