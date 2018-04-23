package java15threads;

//una forma de crear un thread es heredando de la clase Thread
public class ThreadA extends Thread {

	// el codigo que quiera lanzar de forma paralela ser� el que est� en el
	// m�todo run
	public void run() {
		while (true){
			System.out.println("se ejecuta el thread A");
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println("se interrumpi� el hilo");
			}
			
		}
	}// end run
	
}//end class
