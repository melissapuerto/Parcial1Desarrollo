package com.mayab.desarrollo.patrones.comportamiento.template;

public abstract class ProcesarArchivo {
	
	final void procesar() {
		validar();
		abrir();
		leer();
		escribirBD();
		
	}
	
	abstract void validar();
	abstract void leer();
	void abrir() {
		System.out.println("Abriendo");
	}
	void escribirBD() {
		System.out.println("Escribir BD");

	}
	
	
	

}
