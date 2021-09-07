package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarcos {

	public static void main(String[] args) {
		
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}



class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);
		setSize(600,450);
		setLocation(300,200);
		setTitle("Título del frame");
		
		Lamina miLamina = new Lamina();
		
		add(miLamina);
	
	}
	
}



class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estamos utilizando Swing", 100, 100);
		
	}
	
}