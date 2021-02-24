package com.mayab.desarrollo.parcial1.problema222;

public abstract class IVADecorator extends Producto{
	Producto producto;
	
	public IVADecorator(Producto producto){
		this.producto= producto;
	}
	public double calcularPrecio() {
	return this.producto.calcularPrecio();
	}
}
