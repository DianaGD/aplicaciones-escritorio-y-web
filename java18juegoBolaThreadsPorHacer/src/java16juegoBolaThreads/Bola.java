package java16juegoBolaThreads;

import java.awt.Color;
import java.awt.Graphics;

public class Bola {
	
	private int x;
	private int y;
	private int ancho;
	private int alto;
	public Direcciones direccionBola = Direcciones.DERECHA;
	
	//si no hay ningún constructor más, java incluye uno vacio por defecto
	//que ni pide nada ni hace nada
	public Bola(int x, int y) {
		this.x = x;
		this.y = y;
		this.ancho = 50;
		this.alto = 50;
	}
	
	public void mover(){
		if(direccionBola==Direcciones.DERECHA){
			x++;
		}else if(direccionBola == Direcciones.ABAJO){
			y++;
		}else if(direccionBola == Direcciones.ARRIBA){
			y--;
		}else if(direccionBola == Direcciones.IZQUIERDA){
			x--;
		}
	}
	
	public void dibujar(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(x, y, ancho, alto);
	}
	
	//metodo de acceso para la x
	public int getX(){
		return x;
	}

	public int getY() {
		return y;
	}
	
	

}
