package java12ejercicioDiferencias;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana extends JFrame {
	//private es que el elemento solo lo puedo usar desde dentro de la clase
	//public lo puedo usar desde cualquier sitio
	private Image original = null;
	private Image diferencia = null;
	
	// un constructor es un método que se ejecuta
	// cuando se crea un objeto de la clase
	public Ventana() {
		// esto es un constructor que se ejecutara
		// cuando se haga un new Ventana();
		// este es un sitio ideal para preparar al objeto
		
		//vamos a cargar las imagenes
		try {
			original = ImageIO.read(new File("original.jpg"));
			diferencia = ImageIO.read(new File("diferencia.jpg"));
		} catch (IOException e) {
			System.out.println("no pude cargar la imagen");
			System.exit(-1);//forzar a que la aplicación termine
		}
		
		
		this.setSize(800, 400); // hace referencia al objeto
				// que se creó usando new Ventana(); desde el principal
		
		this.setVisible(true); //en este caso this, sería lo mismo
				//que poner miVentana desde el principal
		
		this.setLocation(100, 100);
		this.setTitle("HAZ CLICK EN LA DIFERENCIA DE LA DERECHA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //la aplicación se 
				//cierra cuando se cierre la ventana
		
		//agrego un escuchador del ratón para saber
		//donde va haciendo click el usuario
		this.addMouseListener(new MouseListener() {	
			boolean dif1=false, dif2=false, dif3=false;
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x=e.getX();
				int y=e.getY();
				
				System.out.println("click en x: " + x + " y: " + y);
				
					if(x>=686 && x<=789 && y>=147 && y<=175){
						
						if(!dif1){
							dif1=true;
							
							JOptionPane.showMessageDialog(null, "FELICIDADES, ADIVINASTE UNA DIFERENCIA");
						}
					}else if(x>=465 && x<=486 && y>=145 && y<=179){
						
						if(!dif2){
							dif2=true;
							
							JOptionPane.showMessageDialog(null, "FELICIDADES, ADIVINASTE UNA DIFERENCIA");
						}
					}else if(x>=440 && x<=456 && y>=277 && y<=370){
						
						if(!dif3){
							dif3=true;
							
							JOptionPane.showMessageDialog(null, "FELICIDADES, ADIVINASTE UNA DIFERENCIA");
						}
					}else{
						JOptionPane.showMessageDialog(null, "FALLASTE, INTENTALO DE NUEVO");
						
					}	
					if(dif1 && dif2 && dif3){						
						JOptionPane.showMessageDialog(null, "ENHORABUENA, HAS ENCONTRADO LAS 3 DIFERENCIAS");
						//vamos a cargar las imagenes
						try {
							original = ImageIO.read(new File("original.jpg"));
							diferencia = ImageIO.read(new File("diferencia.jpg"));
						} catch (IOException exc) {
							System.out.println("no pude cargar la imagen");
							System.exit(-1);//forzar a que la aplicación termine
						}
					}
					
			}//end mouseClicked
		});
		
	}// end Ventana
	
	//vamos a sobreescribir el método paint de la clase para ello:
	//botón derecho->Source->Override/Implements Methods...->Window->paint()
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//g.setColor(Color.GREEN);
		//g.fillRect(50, 50, 100, 200);  //posX, posY, ancho, alto
		g.drawImage(original, 0, 0,400,400, null);
		g.drawImage(diferencia, 400, 0,400,400, null);
		//g.drawImage(diferencia, 400, 0, 400, 400, null);
	}
	
	
	

}// end class
