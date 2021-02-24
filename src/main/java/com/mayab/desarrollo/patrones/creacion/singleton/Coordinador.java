package com.mayab.desarrollo.patrones.creacion.singleton;

public class Coordinador {
	public String nombre;
	public String escuela;
	
	public Coordinador(String n, String e) {
		this.nombre=n;
		this.escuela=e;
	}
	
	public void agregarClase(String h, String n)
	{
		SingletonSchedule.getInstance().agregarClase(h, n);
	}
}
