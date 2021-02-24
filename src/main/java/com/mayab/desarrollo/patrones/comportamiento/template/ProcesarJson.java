package com.mayab.desarrollo.patrones.comportamiento.template;

public class ProcesarJson extends ProcesarArchivo{

	public ProcesarJson() {

	}

	@Override
	void validar() {
		System.out.println("Validando JSON");

	}

	@Override
	void leer() {
		System.out.println("Leyendo JSON");

	}

}
