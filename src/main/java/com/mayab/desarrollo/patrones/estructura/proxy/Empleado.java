package com.mayab.desarrollo.patrones.estructura.proxy;

public class Empleado {
String tipo;

	public Empleado(String tipo) {
		this.tipo=tipo;

	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
