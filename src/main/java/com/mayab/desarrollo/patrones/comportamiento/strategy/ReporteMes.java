package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ReporteMes extends Reporte{

	public ReporteMes() {
		exportb = new ExportPDF();
	}

	@Override
	void display() {
		System.out.println("Reporte del mes");
	}

}
