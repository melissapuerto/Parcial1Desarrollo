package com.mayab.desarrollo.parcial1.problema3;


public class GasAltaPresion extends LlenadoLotes{
	String usoBomba;
	int horasUso;
	int nivelInicial;
	int nivelFinal;
	double temperatura;
	double presion;
	String nombre;
	
	public GasAltaPresion(String nombre, String usoBomba, int horasUso, int nivelInicial, int nivelFinal, double temperatura,
			double presion) {
		super();
		this.nombre=nombre;
		this.usoBomba = usoBomba;
		this.horasUso = horasUso;
		this.nivelInicial = nivelInicial;
		this.nivelFinal = nivelFinal;
		this.temperatura = temperatura;
		this.presion = presion;

	}

	@Override
	public void parametroInicial() {
		System.out.println("\n***Obteniendo parametro iniciales para gas de alta presión tipo "+nombre);

		System.out.println("Uso de la bomba: "+usoBomba+" -	Horas de uso: "+horasUso+" -Nivel inicial de materia prima: " + nivelInicial);
	
	}

	@Override
	public void parametroFinal() {
		System.out.println("Obteniendo parametros finales... Nivel de materia prima:"+this.nivelFinal+" -Temperatura de los envases: "+this.temperatura+" -Presión de los envases:"+this.presion);
			
	}

	@Override
	public void calcularVolumen() {
		System.out.println("Obteniendo volumen para gas de alta presión...");
	}

	@Override
	public void inspeccionar() {
		System.out.println("Realizar inspeccion de llenado");
		System.out.println("Imprimir check List..");
		
	}

	

}
