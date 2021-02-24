package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ExportJson implements ExportB{

	public ExportJson() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exportar() {
		System.out.println("Exportación formato JSON");
	}

}
