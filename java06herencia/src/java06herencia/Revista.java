package java06herencia;

//Clase que hereda de Libro y tiene otros datos extras
public class Revista extends Libro {
	public String genero;

	@Override //garantiza que se sobreescribe el método mostrarDatos()
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Género: " + genero);
	}

	public void mostrarRevista() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Paginas: " + paginas);
		System.out.println("Genero: " + genero);
	}

}
