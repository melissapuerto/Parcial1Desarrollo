package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class Driver {

	

	public static void main(String[] args) {
		Articulo articulo1 = new Articulo("a1","30",2);
		Articulo articulo2 = new Articulo("a2","20",1);
		Articulo articulo3 = new Articulo("a3","20",5);

		// TODO Auto-generated method stub
		ReporteMes reporte = new ReporteMes();
		ReporteVentas reporteventas = new ReporteVentas();
		//Agregar articulos
		reporte.agregarArticulo(articulo1);
		reporteventas.agregarArticulo(articulo1);
		reporte.agregarArticulo(articulo2);
		reporteventas.agregarArticulo(articulo2);
		System.out.println("***Reporte ventas y reporte del mes");
		reporte.performExportB(); 
		reporteventas.performExportB();
		//cambiar comportamiento
		System.out.println("****Reporte ventas y reporte del mes con comportamiento cambiado");
		reporte.setExportB(new ExportXML());
		reporteventas.setExportB(new ExportPDF());
		reporte.performExportB(); 
		reporteventas.performExportB();
		

	}

}
