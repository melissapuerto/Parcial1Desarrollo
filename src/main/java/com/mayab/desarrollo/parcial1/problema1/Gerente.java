package com.mayab.desarrollo.parcial1.problema1;


public class Gerente implements Observer{

	@Override
	public void update(String modo) {
		if (modo=="Email") {
			System.out.println("Enviando email. El gasto acaba de exceder el monto maximo!");		

		}
		else if (modo=="Mensaje") {
			System.out.println("Enviando SMS. El gasto acaba de exceder el monto maximo");
		}
		else {
			System.out.println("Enviando email. El gasto acaba de exceder el monto maximo!");		
			System.out.println("Enviando SMS. El gasto acaba de exceder el monto maximo");

		}
		
	}

}
