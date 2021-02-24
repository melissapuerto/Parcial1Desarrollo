package com.mayab.desarrollo.patrones.creacion.factoryMethod;

public abstract class Triangle {
	 String tipo;
	 int ladoA;
	 int ladoB;
	 int ladoC;
	

	public String getTipo() {
		return "Soy un triangulo "+tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
}
