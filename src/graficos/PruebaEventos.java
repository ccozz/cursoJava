package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {

		MarcoBotones miMarco = new MarcoBotones();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}



class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);
		
		LaminaBotones miLamina = new LaminaBotones();
		
		add(miLamina);
		
	}
	
}



class LaminaBotones extends JPanel{
	
	
	
}