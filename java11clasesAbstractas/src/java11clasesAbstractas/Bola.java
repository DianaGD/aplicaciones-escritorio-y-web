package java11clasesAbstractas;

//una clase abstracta sirve para que no se pueda hacer
//objetos de ella, y para que otra herede de ella
public abstract class Bola {

	public int posicionX = 0;
	public int posicionY = 0;

	public void moverBola(int fuerza, int direccion) {
		System.out.println("empujar la bola");
		System.out.println("con una fuerza de: " + fuerza);
		System.out.println("y un angulo de: " + direccion);
	}

}
