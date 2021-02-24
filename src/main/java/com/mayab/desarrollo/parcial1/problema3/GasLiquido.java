package com.mayab.desarrollo.parcial1.problema3;


public class GasLiquido extends LlenadoLotes{
	String nombre;
	int nivelInicial;
	int nivelActual;
	int volumen;
	
	
	public GasLiquido(String nombre, int nivelInicial, int nivelActual) {
		this.nombre=nombre;
		this.nivelInicial=nivelInicial;
		this.nivelActual=nivelActual;

	}
	@Override
	public void parametroInicial() {
		System.out.println("\n***Obteniendo parametro iniciales para gas líquido tipo "+nombre);
		System.out.println("Nivel inicial de materia prima: "+this.nivelInicial);
	}

	@Override
	public void parametroFinal() {
		System.out.println("Obteniendo parametros finales... Nivel actual de materia prima: "+this.nivelActual);
		}

	@Override
	public void calcularVolumen() {
		System.out.println("Obteniendo volumen del gas..."+(this.nivelActual-this.nivelInicial));
	}

	@Override
	public void inspeccionar() {
		System.out.println("Realizar inspeccion para gas líquido");
		System.out.println("Imprimir check List...");
		
	}

	
	
}
