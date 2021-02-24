package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class Articulo {
String nombre;
String precio;
int cantidad;


	public Articulo(String nombre, String precio, int cantidad) {
	
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
