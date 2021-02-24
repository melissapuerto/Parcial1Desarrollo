package com.mayab.desarrollo.parcial1.problema2;


public abstract class Decorador implements Ciudad{
	protected Ciudad ciudadDecorada;
	
	public Decorador(Ciudad ciudadDecorada) {
		this.ciudadDecorada = ciudadDecorada;
	}

	@Override
	public double precioFinal() {
		return ((Producto)this.ciudadDecorada).getPrecio();
	}
	
	
}
