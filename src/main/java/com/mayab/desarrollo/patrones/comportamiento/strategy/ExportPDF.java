package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ExportPDF implements ExportB{

	public ExportPDF() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exportar() {
		System.out.println("Exportación formato PDF");
	}

}
