package com.mayab.desarrollo.patrones.estructura.proxy;

public class ReporteVentasProxy implements Reporte{
//aca se crea el reporte ventas
	Empleado employee;
	ReporteVentas reporteventas;
	
	public ReporteVentasProxy(Empleado empleado) {
		this.employee=empleado;
		reporteventas= new ReporteVentas();
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public void leer() {
		reporteventas.leer();
	}

	@Override
	public void escribir(String t) {
		if(employee.getTipo()=="empleado") {
			System.out.println("permiso para escribir denegado");
		}
		else {
			reporteventas.escribir(t);
		}
	}

}
