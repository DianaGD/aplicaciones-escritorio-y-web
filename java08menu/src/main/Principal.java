package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		// lo siguiente es un objeto que guarda objetos de la clase pelicula
		ArrayList<Libro> listDeLibros = new ArrayList<Libro>();
		Scanner miScanner = new Scanner(System.in);
		int intWhile = 0;
		while (intWhile != -1) {
			System.out.println("opcion es distinto de -1");
			System.out.println("Inserta una opcion: ");

			System.out.println("1-Introducir libro");
			System.out.println("2-Listar libros");
			System.out.println("3-Salir");

			String introducido = miScanner.nextLine();

			System.out.println("Has introducido: " + introducido);
			int introducidoInt = Integer.parseInt(introducido);
			switch (introducidoInt) {
			case 1:
				System.out.println("Introduce los datos del libro: ");
				// código para registrar un libro
				Libro nuevo = new Libro();

				System.out.println("Introduce el titulo: ");
				introducido = miScanner.nextLine();
				nuevo.titulo = introducido;

				System.out.println("Introduce las paginas: ");
				introducido = miScanner.nextLine();
				nuevo.paginas = Integer.parseInt(introducido);

				System.out.println("Introduce el precio: ");
				introducido = miScanner.nextLine();
				nuevo.precio = Double.parseDouble(introducido);

				// y agregamos el libro a la lista
				listDeLibros.add(nuevo);
				System.out.println("LIBRO REGISTRADO CORRECTAMENTE.");
				break;
			case 2:
				System.out.println("Listado libros: ");
				System.out.println("---------------");
				// codigo para listar los libros
				//JAVA soporta foreach para recorrer arrays y colecciones
				//por cada libro llamado libro (o como quieras llamarlo) de listDeLibros
				for (Libro libro : listDeLibros) {
					libro.mostrarDatos();
				}
				System.out.println("---------------------");
				break;
			case 3:
				System.out.println("Hasta luego");
				intWhile = -1;
				break;

			default:
				break;
			}// end switch

		}// end while
		System.out.println("despues de while");
		miScanner.close();

	}// end main

}// end class
