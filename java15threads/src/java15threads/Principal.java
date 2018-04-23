package java15threads;

public class Principal {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		// para lanzar un thread y que ejecute su metodo run
		// de forma paralela debo llamar al metodo start()
		ta.start();
		
		
		//para lanzar un Runnable debo hacer lo siguiente:
		ThreadB tb = new ThreadB();
		Thread ttb = new Thread(tb);
		ttb.start();
		
		System.out.println("fin del main");

	}

}
