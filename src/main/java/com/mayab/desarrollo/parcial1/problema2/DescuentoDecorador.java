package com.mayab.desarrollo.parcial1.problema2;


public class DescuentoDecorador extends Decorador{
	private double descuento;
	
	public DescuentoDecorador(Ciudad ciudadDecorada, double descuento) {
		super(ciudadDecorada);
		this.descuento = descuento;
	}
	
	@Override
	public double precioFinal() {
		return super.precioFinal()-(((Producto)super.ciudadDecorada).getPrecio()*descuento);
	}
	

}
