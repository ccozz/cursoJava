package paquetepruebas;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora();

		Timer miTemporizador = new Timer(2000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		System.exit(0);
	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("La hora ser� demostrada cada 2 segundos: " + ahora);
	
		Toolkit.getDefaultToolkit().beep();
	}
}