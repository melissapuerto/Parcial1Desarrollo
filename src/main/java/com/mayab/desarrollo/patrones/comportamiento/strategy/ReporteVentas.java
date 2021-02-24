package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ReporteVentas extends Reporte{

	public ReporteVentas() {
		exportb = new ExportJson();
	}

	@Override
	void display() {
		System.out.println("Reporte Ventas");
	}

}
