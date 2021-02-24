package com.mayab.desarrollo.parcial1.problema3;


public abstract class LlenadoLotes {

	final void llenar() {
		parametroInicial();
		parametroFinal();
		calcularVolumen();
		inspeccionar();
		imprimirReporte();
		
	}
	
	
	public abstract void parametroInicial();
	public abstract void parametroFinal();
	public abstract void calcularVolumen();
	public abstract void inspeccionar();
	public void imprimirReporte() {
		System.out.println("Reporte de llenado:");
		System.out.println("Fecha...");
		System.out.println("Cantidad envasada...");
		System.out.println("Firmas de operdores e insprectores __________ __________ ");
	 }
}
