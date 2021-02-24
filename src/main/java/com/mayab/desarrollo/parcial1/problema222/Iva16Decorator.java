package com.mayab.desarrollo.parcial1.problema222;

public class Iva16Decorator extends IVADecorator {

	public Iva16Decorator(Producto producto) {
		super(producto);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecio() {
		return (this.producto.calcularPrecio()+(this.producto.calcularPrecio()*.16));
	}
	

}
