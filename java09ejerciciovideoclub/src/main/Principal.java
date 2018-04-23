package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* 
		 * EJERCICIO VIDEOCLUB:
		 * 
		 * Crear una aplicación de consola que permita el registro
		 * y listado de películas.
		 * Una película tendra: titulo, duracion (minutos), precio, genero y resumen.
		 * 
		 * 
		 * */
		
		ArrayList<Pelicula> peliList = new ArrayList<Pelicula>();
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		while(opcion!=-1){
			System.out.println("Elige una opcion:");
			System.out.println("1-Registrar pelicula");
			System.out.println("2-Listar peliculas");
			System.out.println("3-Salir");
			
			String introducido = teclado.nextLine();
			int introducidoInt = Integer.parseInt(introducido);
			switch (introducidoInt) {
			case 1:
				//Registrar pelicula
				System.out.println("Intro datos de la pelicula:");
				Pelicula nueva = new Pelicula();
				
				System.out.println("Intro titulo:");
				introducido=teclado.nextLine();
				nueva.titulo=introducido;
				
				System.out.println("Intro duracion en minutos:");
				introducido=teclado.nextLine();
				nueva.duracion=Integer.parseInt(introducido);
				
				System.out.println("Intro precio:");
				introducido=teclado.nextLine();
				nueva.precio=Double.parseDouble(introducido);
				
				System.out.println("Intro genero:");
				introducido=teclado.nextLine();
				nueva.genero=introducido;
				
				System.out.println("Intro resumen:");
				introducido=teclado.nextLine();
				nueva.resumen=introducido;
				
				break;
				
			case 2:
				//Listar peliculas
				System.out.println("Listado peliculas: ");
				System.out.println("---------------");
				// codigo para listar las peliculas
				
				for (Pelicula pelicula : peliList) {
					System.out.println("dentro foreach");
					pelicula.mostrarDatos();
				}
				System.out.println("---------------------");
				break;
				
			case 3:
				//Salir
				System.out.println("Hasta luego");
				opcion = -1;
				break;
	
			default:
				break;
			}//end switch
		}//end while
	}//end main

}//end class
