package com.mayab.desarrollo.parcial1.problema3;

public class Driver {

	public static void main(String[] args) {
		GasAcetileno gasacetileno = new GasAcetileno("Etino",2,3);
		GasAltaPresion gasaltapresion = new GasAltaPresion("GasA","Uso positivo", 5,3,4,50.4,60.2);
		GasLiquido gasliquido = new GasLiquido("GasL", 4,5);
		gasacetileno.llenar();
		gasaltapresion.llenar();
		gasliquido.llenar();

	}

}
