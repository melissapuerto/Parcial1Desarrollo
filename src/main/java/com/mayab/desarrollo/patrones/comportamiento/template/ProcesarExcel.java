package com.mayab.desarrollo.patrones.comportamiento.template;

public class ProcesarExcel extends ProcesarArchivo {

	public ProcesarExcel() {

	}

	@Override
	void validar() {
		System.out.println("Validando Excel");
		
	}

	@Override
	void leer() {
		System.out.println("Leyendo Excel");
		
	}

}
