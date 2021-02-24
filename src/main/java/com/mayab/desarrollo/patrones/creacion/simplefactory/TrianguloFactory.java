package com.mayab.desarrollo.patrones.creacion.simplefactory;

public class TrianguloFactory {

	public static Triangulo getTriangulo(int ladoA, int ladoB, int ladoC) {
        Triangulo triangulo= null;        	
            if (ladoA!=ladoB && ladoB!=ladoC && ladoC!=ladoA) {
                triangulo = new TriEsc();
            } else if (ladoA==ladoB && ladoB==ladoC&& ladoA==ladoC) {
                triangulo = new TriEq();
            }
            else {
	            triangulo = new TriIso();
	        }   
	        
        return triangulo;

        }

}
