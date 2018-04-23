package java10interfaces;

public class Principal {

	public static void main(String[] args) {

		Defensa ana = new Defensa();
		Defensa luis = new Defensa();
		Delantero marco = new Delantero();
		Centrocampista julian = new Centrocampista();
		Portero isabel = new Portero();
		
		//de un interfaz no puedo crear objetos:
		//Jugador j = new Jugador();
		//pero lo que si puedo hacer es crear lo que se llama
		//una clase an�nima. Una clase an�nima no tiene nombre
		//y es usada para la creaci�n de un objeto que
		//cumpla las reglas de un interfaz:
		Jugador j = new Jugador() {
			
			@Override
			public void parar() {
				// TODO Auto-generated method stub
				System.out.println("parar para j");
			}
			
			@Override
			public void correr() {
				// TODO Auto-generated method stub
				System.out.println("correr para j");
			}
		};
		agregarJugadorAlCampo(j);

		agregarJugadorAlCampo(ana);
		agregarJugadorAlCampo(luis);
		// Para solucionar el siguiente problema y que el m�todo
		// pueda recibir tanto defensas como delanteros
		// podr�a usar herencia. La herencia en java est� limitada
		// a que una clase solo pueda, como mucho, heredar de otra.
		// La soluci�n que vamos a mostrar es usando interfaces
		// Una clase puede "heredar" de todos los interfaces que quiera.
		// Una interfaz es lo mismo que una clase abstracta cuyos m�todos
		// no tienen c�digo y en la clase no hay variables.
		agregarJugadorAlCampo(marco);
		agregarJugadorAlCampo(isabel);
		agregarJugadorAlCampo(julian);
		

	}

	// el modificador static indica que el elemento puede
	// ser usado directamente sin necesidad de hacer un
	// objeto para ello
	public static void agregarJugadorAlCampo(Jugador d) {
		System.out.println("agrego un jugador");
		d.correr();
	}

}
