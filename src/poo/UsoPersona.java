package poo;

import java.util.GregorianCalendar;
import java.util.Date;

public class UsoPersona {

	public static void main(String[] args) {
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Junior Vampeta", 50000, 2005, 02, 28);
		lasPersonas[1] = new Alumno("Orlando Pesablanca", "Empolvador de nariz");
		
		for (Persona persona : lasPersonas) {
			System.out.println(persona.dameDescripcion());
		}
	}
	
}


abstract class Persona{
	private String nombre;
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

	
class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes -1, dia);
		this.altaContrato = calendario.getTime();
		++IdSiguiente;
		Id = IdSiguiente;
	
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	public String dameDescripcion() {
		return "El empleado " + dameNombre() + " tiene el Id= " + Id + " y su sueldo asciende a $ " + sueldo;
	}
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;

}


class Alumno extends Persona{
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	
	private String carrera;
	
	public String dameDescripcion() {
		return "El alumno " + dameNombre() + " estudia la carrera de " + carrera;
	}
}
