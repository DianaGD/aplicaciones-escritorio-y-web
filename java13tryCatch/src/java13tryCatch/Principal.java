package java13tryCatch;

public class Principal {

	public static void main(String[] args) {

		//cuando queramos controlar una excepción
		//debemos usar el bloque try-catch
		System.out.println("voy a intentar transformar un String "
				+ "en tipo int");
		//String introducido = "123"; esto funcionaría correctamente, por lo tanto se ejecuta try 
		String introducido = "hola"; //esto no lo puede transformar a int, por lo tanto catch
		try {
			//instrucciones que pueden dar error/excepcion
			int numero = Integer.parseInt(introducido);
			//si alguna instrucción del try da error
			//el try NO CONTINUA y se ejecuta el codigo del catch
			System.out.println("Numero convertido a int correctamente");
		} catch (Exception e) {
			//codigo a ejecutar si en el try una instruccion
			//dio error o excepcion
			System.out.println("no puedo transformar a int");
			System.out.println("numero introducido no valido");
		}
		System.out.println("despues del try-catch");
	}//end main

}//end Principal
