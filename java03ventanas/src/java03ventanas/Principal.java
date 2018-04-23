package java03ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		// por un lado crearemos nuestras propias clases
		// y por otro usaremos las que nos ofrezcan para
		// realizar operaciones típicas como:
		// -sacar ventanas
		// -realizar conexión con una base de datos
		// -tratar ficheros
		// etc...

		// cuando usemos una clase que no esté en el mismo
		// paquete en el que estamos y no sea una clase
		// del paquete java.lang, debemos decir de qué paquete es

		JFrame ventana = new JFrame();
		JPanel panel = new JPanel();
		
		//Cuando la clase me da diferentes opciones para crear
		//un objeto eso es lo que se llama diferentes constructores
		JButton boton = new JButton("PULSAME");
		panel.add(boton);
		
		JTextField campoTexto = new JTextField(18);
		panel.add(campoTexto);	
		
		ventana.add(panel);

		ventana.setVisible(true);
		ventana.setSize(400, 200);
		ventana.setLocation(100, 100);

	}

}
