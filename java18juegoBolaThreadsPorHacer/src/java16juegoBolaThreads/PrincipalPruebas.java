package java16juegoBolaThreads;

public class PrincipalPruebas {

	public static void main(String[] args) {
		// cuando creemos una instancia usando new
		// debemos indicar el constructor a usar
		Bola b = new Bola(40, 50);

		// muchas veces necesitamos que los valores que
		// tenga un objeto no se puedan modificar desde fuera
		// de su clase para que tengamos un control total sobre
		// los mismos

		// en este caso, puedo dar una x e y iniciales a una bola
		// pero luego no puedo modificarlas de repente
		// b.x=50 esto daria error

		// lo siguiente sacaría el valor del return
		// que hace el metodo obtenerX
		System.out.println("la bola esta en la posicion x: " + b.getX()
				+ " y: " + b.getY());

	}

}
