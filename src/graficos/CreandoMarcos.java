package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class miMarco extends JFrame{
	
	public miMarco(){
		//setSize(400, 250);
		//setLocationRelativeTo(null);
		setBounds(600, 300, 450, 250);
		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Ventana Puchi");
	
	}

}
