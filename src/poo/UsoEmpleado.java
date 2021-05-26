package poo;

import java.util.GregorianCalendar;
import java.util.Date;

public class UsoEmpleado {
	
	
}

class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes -1, dia);
		this.altaContrato = calendario.getTime();
		++IdSiguiente;
		Id = IdSiguiente;
	
	}
	
	public Empleado(String nombre) {
		this(nombre, 30000, 2000, 01, 01);
	}
	
	public String dameNombre() {
		return nombre + "Id: " + Id;
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
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;

}