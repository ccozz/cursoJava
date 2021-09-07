package paquetepruebas;

import java.util.Scanner;

public class UsoTallas {
	
	//enum talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum talla {
	
		MINI("s"), MEDIANO("m"), GRANDE("l"), MUY_GRANDE("xl");
		
		private talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		private String abreviatura;
		
		public String dameAbreviatura() {
			return abreviatura;
		}
	
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		
		String datos = entrada.next().toUpperCase();
		
		talla laTalla = Enum.valueOf(talla.class, datos);
		
		System.out.println("Talla: " + laTalla);
		
		System.out.println("Abreviatura: " + laTalla.dameAbreviatura());
	}

}
