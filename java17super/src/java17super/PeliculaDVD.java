package java17super;

public class PeliculaDVD extends Pelicula {
	public PeliculaDVD(){
		//super(); //así digo que cuando cree un objeto de esta clase se use el constructor
					//que no pide nada de la clase padre, en este caso Pelicula
		super("titulo de la pelicula");
		System.out.println("Constructor que no pide nada de PeliculaDVD");
	}
}
