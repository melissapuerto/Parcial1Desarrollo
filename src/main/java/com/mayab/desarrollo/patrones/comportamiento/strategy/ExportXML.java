package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ExportXML implements ExportB{

	public ExportXML() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exportar() {
		System.out.println("Exportación formato xml");
		
	}

}
