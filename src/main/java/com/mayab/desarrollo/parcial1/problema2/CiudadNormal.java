package com.mayab.desarrollo.parcial1.problema2;

public class CiudadNormal extends Producto implements Ciudad{

	public CiudadNormal(String nombre, double precio, boolean iva) {
		super(nombre, precio, iva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double precioFinal() {
		if (this.getIva()) {
			return this.getPrecio()*1.16;
		}
		else {
			return this.getPrecio();
		}
	}
	
	public double getPrecio() {
		return this.getPrecio();
	}
}
