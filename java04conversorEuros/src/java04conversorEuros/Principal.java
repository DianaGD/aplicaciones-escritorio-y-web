package java04conversorEuros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * EJERCICIO:
 * CREAR UN NUEVO PROYECTO DE JAVA PARA CREAR UN CONVERSOR DE EUROS A DOLARES
 * */


public class Principal {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		JPanel panel = new JPanel();
		JLabel texto = new JLabel(
				"Introduce la cantidad de dólares a transformar");
		final JTextField entradaDolares = new JTextField(15);
		JButton botonConvertir = new JButton("Convertir a Euros");

		// Vamos a decir que es lo que queremos que haga el botón
		botonConvertir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// Lo que queramos que haga el botón lo pondremos
				// en este método
				System.out.println("boton pulsado");
				System.out.println("Dolares insertados: "
						+ entradaDolares.getText());
				double dolares = Double.parseDouble(entradaDolares.getText());
				double euros = dolares * 0.81;
				
				JOptionPane.showMessageDialog(null, "Euros: "+euros);
			}
		});

		panel.add(texto);
		panel.add(entradaDolares);
		panel.add(botonConvertir);

		ventana.add(panel);
		ventana.setSize(500, 200);
		ventana.setLocation(100, 100);
		ventana.setVisible(true);
	}
}
