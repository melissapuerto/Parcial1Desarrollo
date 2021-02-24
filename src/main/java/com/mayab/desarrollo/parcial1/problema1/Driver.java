package com.mayab.desarrollo.parcial1.problema1;


public class Driver {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Compania comp = new Compania(5.0,"ambos");
		comp.registerObserver(gerente);
		comp.agregarGasto(150.0);
		System.out.println("***cambiando el comportamiento a solo email");
		comp.setModo("Email");
		comp.agregarGasto(1500.0);

	}
}
