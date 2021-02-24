package com.mayab.desarrollo.parcial1.problema2;


public class CiudadFrontera extends Producto implements Ciudad{
	
	public CiudadFrontera(String nombre, double precio, boolean iva) {
		super(nombre, precio, iva);
	}

	@Override
	public double precioFinal() {
		if (this.getIva()) {
			return this.getPrecio()*1.08+this.getPrecio()*1.02;
		}
		else {
			return this.getPrecio()*1.02;
		}
	}
	
	public double getPrecio() {
		return this.getPrecio();
	}
}
