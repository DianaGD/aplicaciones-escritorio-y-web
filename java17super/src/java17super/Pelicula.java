package java17super;

public class Pelicula {
	
	private String titulo;

	public Pelicula(String titulo) {
		System.out.println("Se ejecuta el constructor de pelicula que pide un string");
		this.titulo = titulo;
	}
	
	public Pelicula(){
		System.out.println("Se ejecuta el constructor de pelicula que NO pide nada");
		
	}
	
}
