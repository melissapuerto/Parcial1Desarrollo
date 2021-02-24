package com.mayab.desarrollo.parcial1.problema2;

public abstract class Producto {
	double costoBase=0.0;
	 public double getcostoBase() {
	        return costoBase;
	    }
	public abstract double calcularPrecio();
	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}

}
