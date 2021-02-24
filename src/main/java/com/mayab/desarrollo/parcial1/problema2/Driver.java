package com.mayab.desarrollo.parcial1.problema2;

public class Driver {

	public static void main(String[] args) {
	Producto precioMerida = new ProductoBase();
	precioMerida.setCostoBase(100.0);
	precioMerida= new Iva16Decorator(precioMerida);
	precioMerida= new DescuentoDecorator(precioMerida);
	System.out.println("Precio del producto en Merida (con IVA 16% y descuento): "+precioMerida.calcularPrecio());
	
	Producto precioChetumal = new ProductoBase();
	precioChetumal.setCostoBase(50.0);
	precioChetumal= new Iva8Decorator(precioChetumal);
	precioChetumal= new DescuentoDecorator(precioChetumal);
	precioChetumal= new Iva2Decorator(precioChetumal);
	System.out.println("Precio del producto en Chetumal (con IVA 8%,2% y descuento): "+precioChetumal.calcularPrecio());
	
	
	
		
		
	

	}

}
