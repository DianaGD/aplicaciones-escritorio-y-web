package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import paneles.PanelListadoClientes;
import paneles.PanelRegistroCliente;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private PanelRegistroCliente panelRegistroCliente = new PanelRegistroCliente();
	private PanelListadoClientes panelListadoClientes = new PanelListadoClientes();

	// barra de menu:
	private JMenuBar barraDeMenu = new JMenuBar();
	private JMenu menuClientes = new JMenu("Clientes");
	private JMenu menuAyuda = new JMenu("Ayuda");

	public VentanaPrincipal() {
		
		//preparar la barra de menu:
		JMenuItem clientesInsertar = new JMenuItem("Insertar Cliente");
		JMenuItem clientesListar = new JMenuItem("Listar Clientes");
		menuClientes.add(clientesInsertar);
		menuClientes.add(clientesListar);		
		barraDeMenu.add(menuClientes);
		barraDeMenu.add(menuAyuda);
		this.setJMenuBar(barraDeMenu);
		
		
		//voy a decir a las opciones de menu qui�n las va a atender cuando se haga click en ellas
		//se va a  ejecutar el m�todo actionPerformed
		clientesInsertar.addActionListener(this); //this: el objeto de ventana ppal va a atender a clientesInsertar
		clientesListar.addActionListener(this);
		
		//preparaci�n de la ventana principal
		this.setSize(800, 600);
		this.setTitle("TITULO");
		//this.setIconImage(getIconImage());
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//vamos a decir que cuando arranque esta ventana se
		//muestre el panel de registro cliente
		//this.add(panelRegistroCliente); MEJOR HACERLO CON setContentPane, porque es el panel que va a contener el resto de elementos
		this.setContentPane(panelRegistroCliente);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("atiendo a: "+e.getActionCommand());
		if(e.getActionCommand().equals("Insertar Cliente")){
			setContentPane(panelRegistroCliente);
		}else if(e.getActionCommand().equals("Listar Clientes")){
			setContentPane(panelListadoClientes);
		}
		//para refrescar toda la pantalla y nos cambie el panel
		SwingUtilities.updateComponentTreeUI(this);
	}

}
