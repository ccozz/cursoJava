package poo;

public class UsoVehiculo {

	public static void main(String[] args) {
		Coche miCoche1 = new Coche();
		
		miCoche1.setColor("Azul y Oro");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		
		miFurgoneta1.setColor("Celeste y Blanca");
		miFurgoneta1.isAsientos_cuero();
		miFurgoneta1.isClimatizador();
			
	}

}
