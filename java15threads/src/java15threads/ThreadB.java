package java15threads;
//la segunda forma de crear un thread es implementando el
//interfaz Runnable
public class ThreadB implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("***se ejecuta el thread B");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("se ha interrumpido el thread B");
			}
		}
		
	}
	
}
