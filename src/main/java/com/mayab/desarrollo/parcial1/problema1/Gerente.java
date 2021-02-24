package com.mayab.desarrollo.parcial1.problema1;


public class Gerente implements Observador{

	@Override
	public void update() {
		System.out.println("El gasto acaba de exceder el monto maximo!");		
	}

}
