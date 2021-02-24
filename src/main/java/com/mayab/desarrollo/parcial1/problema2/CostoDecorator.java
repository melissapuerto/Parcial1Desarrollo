package com.mayab.desarrollo.parcial1.problema2;

public abstract class CostoDecorator extends Producto{
	Producto producto;
	
	public CostoDecorator(Producto producto){
		this.producto= producto;
	}
	public double calcularPrecio() {
	return this.producto.calcularPrecio();
	}
	
}
