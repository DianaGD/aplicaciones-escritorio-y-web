package java16juegoBolaThreads;




/*
 * EJERCICIO THREADS JUEGO BOLA:
 * 1-PERMITIR MOVER LA BOLA EN LAS CUATRO DIRECCIONES: ARRIBA, IZQUIERDA, DERECHA,ABAJO
 * 2-SI LA BOLA SE SALE POR EL BORDE SUPERIOR O IZQUIERDO DE LA PANTALLA, 
 * INDICAR AL USUARIO QUE HA PERDIDO
 * 3-INCLUIR UNA SERIE DE OBSTACULOS SIMILARES A LA ZONA DE META
 * DE FORMA QUE SI LA BOLA COLISIONA CON ALGUNO DE ELLOS, INDICAREMOS AL
 * USUARIO QUE HA PERDIDO
 * 4-UNA VEZ QUE EL USUARIO LLEVE LA BOLA A LA ZONA DE META EN VEZ DE TERMINAR
 * LA APLICACI�N, PONER DE NUEVO LA BOLA EN SU POSICI�N INICIAL, PEDIRLE QUE LA
 * LLEVE DE NUEVO A LA META INCREMENTANDO LA VELOCIDAD DE LA BOLA.
 * 
 * OPCIONALES:
 * 1-POSICIONAR DE FORMA ALEATORIA LOS OBST�CULOS Y LA META CADA VEZ QUE COMIENCE EL JUEGO
 * TAMBI�N DAR UN TAMA�O ALEATORIO A LOS MISMOS Y FINALMENTE HACER QUE LOS OBST�CULOS SE 
 * MUEVAN SIGUIENDO UN PATR�N DE MOVIMIENTO DE DERECHA-IZQUIERDA ABAJO-ARRIBA.
 * nota: para sacar aleatorios->Random r = new Random(); int numAleatorio = r.nextInt(50);
 * 		si quieres que no parta de 0, sino de un numero  int numAleatorio = 10+r.nextInt(50);
 * 						numAleatorio valdr�a un valor aleatorio entre 10 y 59
 * 
 * */



public class Principal {

	public static void main(String[] args) {
		new Ventana();

	}

}