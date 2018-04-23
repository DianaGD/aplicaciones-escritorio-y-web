package java06herencia;

public class Principal {

	public static void main(String[] args) {

		Libro nuevo = new Libro();
		nuevo.titulo = "El Quijote";
		nuevo.paginas = 555;

		Libro otro = new Libro();
		otro.titulo = "Aprenda Java";
		otro.paginas = 120;
		
		Revista objetoRevista = new Revista();
		objetoRevista.titulo="Muy interesante";
		objetoRevista.paginas=60;
		objetoRevista.genero="ciencia y cultura";

		nuevo.mostrarDatos();
		otro.mostrarDatos();
		objetoRevista.mostrarDatos();

	}

}
