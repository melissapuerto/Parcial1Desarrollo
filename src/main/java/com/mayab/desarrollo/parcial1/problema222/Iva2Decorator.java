package com.mayab.desarrollo.parcial1.problema222;

public class Iva2Decorator extends IVADecorator {

	public Iva2Decorator(Producto producto) {
		super(producto);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecio() {
		return (this.producto.calcularPrecio()+(this.producto.calcularPrecio()*.02));
	}
	

}
