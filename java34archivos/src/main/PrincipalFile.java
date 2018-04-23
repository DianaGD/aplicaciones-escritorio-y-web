package main;

import java.io.File;

public class PrincipalFile {

	public static void main(String[] args) {
		//la clase File sirve para trabajar con rutas
		//de carpetas y archivos pero no para trabajar
		//su contenido
		File miFile = new File("micarpeta/archivos");
		if(miFile.exists()){
			System.out.println("la ruta ya existe");
		}else{
			System.out.println("vamos a crear la ruta");
			miFile.mkdirs();
		}
		File otroFile=new File("datos.dat");
		if(otroFile.exists()){
			System.out.println("datos.dat ocupa: " +otroFile.length());
		}
	}//end main
}//end class
