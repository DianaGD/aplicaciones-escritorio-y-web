package java05conversorDolares;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		JPanel panel = new JPanel();
		JLabel texto = new JLabel(
				"Introduce la cantidad de euros a transformar");
		final JTextField entradaEuros = new JTextField(15);
		JButton botonConvertir = new JButton("Convertir a Dolares");

		// Vamos a decir que es lo que queremos que haga el botón
		botonConvertir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// Lo que queramos que haga el botón lo pondremos
				// en este método
				System.out.println("boton pulsado");
				System.out.println("Euros insertados: "
						+ entradaEuros.getText());
				double euros = Double.parseDouble(entradaEuros.getText());
				double dolares = euros * 1.19;

				JOptionPane.showMessageDialog(null, "Dolares: " + dolares);
			}
		});
		
		panel.add(texto);
		panel.add(entradaEuros);
		panel.add(botonConvertir);

		ventana.add(panel);
		ventana.setSize(500, 200);
		ventana.setLocation(100, 100);
		ventana.setVisible(true);

	}

}
