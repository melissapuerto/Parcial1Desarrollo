package com.mayab.desarrollo.parcial1.problema1;


public class main {
	public static void main(String[] args) {
		Gerente c = new Gerente();
		Compania comp = new Compania(100000.0);
		comp.enlazar(c);
		comp.agregarGasto(1500.0);
		comp.agregarGasto(1500.0);
		comp.agregarGasto(300000.0);
	}
}
