package com.mayab.desarrollo.parcial1.problema222;

public class DescuentoDecorator extends CostoDecorator {

	public DescuentoDecorator(Producto producto) {
		super(producto);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecio() {
		return (this.producto.calcularPrecio()-(this.producto.calcularPrecio()*.02));
	}
	

}
