package poo;

import java.util.GregorianCalendar;
import java.util.Arrays;
import java.util.Date;

public class UsoEmpleado {
	public static void main(String[] args) {
		
		Jefatura jefe_RRHH = new Jefatura("Orlando Pesablanca", 55000, 2002, 7, 23);
		
		jefe_RRHH.estableceIncentivo(6500);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Blanca Tiza", 23000, 1994, 3, 2);
		misEmpleados[1] = new Empleado("Jaime Lloraelnaso", 18000, 2001, 6, 17);
		misEmpleados[2] = new Empleado("Junior Vampeta", 33000, 2008, 2, 1);
		misEmpleados[3] = new Empleado("Rosa Meltrozo", 31000, 1986, 11, 11);
		misEmpleados[4] = new Empleado("Anibal Trolo", 18000, 2020, 1, 1);
		misEmpleados[5] = new Empleado("Jorge Nasopartido", 22000, 2003, 9, 2);
		
		Jefatura jefa_Finanzas = new Jefatura("Ana Canuto", 44000, 1999, 12, 31);
		
		jefa_Finanzas.estableceIncentivo(5600);
		
		System.out.println(jefa_Finanzas.tomarDecisiones("Subir los sueldos"));
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " + 
		jefa_Finanzas.estableceBonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + 
		misEmpleados[3].estableceBonus(300));
		
		Empleado director_comercial = new Jefatura("Rolando Aspireti", 56000, 2002, 2, 3);
		
		Comparable ejemplo = new Empleado("Ricarda Lablanc", 92000, 1997, 11, 11);
		
		for (Empleado e : misEmpleados) {
			e.subeSueldo(10);
		}
		
		Arrays.sort(misEmpleados);
		
		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre()
			+ "\t\tSueldo: " + e.dameSueldo()
			+ "\t\tFecha de alta: " + e.dameFechaContrato());
		}
		
	}
	
}

class Empleado implements Comparable, Trabajadores {
	
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
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores.bonusBase + gratificacion;
	}
	
	public String dameNombre() {
		return nombre + " Id: " + Id;
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
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		
		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;

}


class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	
	public String tomarDecisiones(String decision) {
		return "Un miembro ha tomado la decisión de: " + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		double prima = 2000;
		
		return Trabajadores.bonusBase + gratificacion + prima;
	}
	
	private double incentivo;
}