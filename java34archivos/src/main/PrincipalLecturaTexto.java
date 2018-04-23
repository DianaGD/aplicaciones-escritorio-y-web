package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalLecturaTexto {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("miarchivo.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine();
			while(linea!=null){
				System.out.println(linea);
				linea=br.readLine();
			}
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("no encuentro el archivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error cerrando u operando con flujo de datos");
			e.printStackTrace();
		}

	}//end main

}//end class
