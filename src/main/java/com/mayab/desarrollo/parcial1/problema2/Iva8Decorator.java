package com.mayab.desarrollo.parcial1.problema2;

public class Iva8Decorator extends CostoDecorator {

	public Iva8Decorator(Producto producto) {
		super(producto);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecio() {
		return (this.producto.calcularPrecio()+(this.producto.calcularPrecio()*.08));
	}
	

}
