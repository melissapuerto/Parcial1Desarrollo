package com.mayab.desarrollo.patrones.creacion.abstractFactory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MueblesStore tienda = new MueblesStore();
	tienda.crearSala("Moderna");
	tienda.entregarSala();
	tienda.crearSala("Victoriana");
	tienda.entregarSala();
	tienda.crearSala("Ochentera");
	tienda.entregarSala();
	}

}
