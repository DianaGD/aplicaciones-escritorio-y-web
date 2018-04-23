package java15threads;

//una forma de crear un thread es heredando de la clase Thread
public class ThreadA extends Thread {

	// el codigo que quiera lanzar de forma paralela será el que esté en el
	// método run
	public void run() {
		while (true){
			System.out.println("se ejecuta el thread A");
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println("se interrumpió el hilo");
			}
			
		}
	}// end run
	
}//end class
