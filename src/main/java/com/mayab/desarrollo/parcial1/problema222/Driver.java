package com.mayab.desarrollo.parcial1.problema222;

public class Driver {

	public static void main(String[] args) {
	Producto p = new ProductoBase();
	System.out.println("Producto sin nada"+p.calcularPrecio());
	p = new Iva2Decorator(p);
	System.out.println("Producto con 2 de IVA"+p.calcularPrecio());
	p = new Iva8Decorator(p);
	System.out.println("Producto mas 8 de IVA"+p.calcularPrecio());
	p = new DescuentoDecorator(p);
	System.out.println("Producto descuento"+p.calcularPrecio());
	

	}

}
