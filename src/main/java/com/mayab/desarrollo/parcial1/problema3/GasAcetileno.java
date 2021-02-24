package com.mayab.desarrollo.parcial1.problema3;


public class GasAcetileno extends LlenadoLotes{
	String nombre;
	int inicialTambores;
	int finalTambores;
	
	
	public GasAcetileno(String nombre, int inicialTambores, int finalTambores) {
		this.nombre=nombre;
		this.inicialTambores=inicialTambores;
		this.finalTambores=finalTambores;

	}
	
	@Override
	public void parametroInicial() {
		System.out.println("\n***Obteniendo parametro iniciales para gas acetileno tipo "+nombre);
		System.out.println("Cantidad de tambores: "+this.inicialTambores);
	}
	@Override
	public void parametroFinal() {
		System.out.println("Obteniendo parametros finales... Cantidad final de tambores: "+ this.finalTambores);
	}
	@Override
	public void calcularVolumen() {
		System.out.println("Obteniendo volumen del gas acetileno...");

	}
	@Override
	public void inspeccionar() {
		System.out.println("Realizando inspeccion de llenado...");
		System.out.println("Inspección rigurosa...");
		System.out.println("Cargando check List..");
		
	}

}
