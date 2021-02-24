package com.mayab.desarrollo.parcial1.problema2;


public class Producto {
	private String nombre;
	private double precio;
	private boolean iva;
	
	public Producto(String nombre,double precio,boolean iva) {
		this.iva = iva;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setIva(boolean iva) {
		this.iva = iva;
	}
	
	public boolean getIva() {
		return iva;
	}
	
}
