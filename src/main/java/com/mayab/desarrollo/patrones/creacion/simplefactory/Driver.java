package com.mayab.desarrollo.patrones.creacion.simplefactory;

public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo escaleno = TrianguloFactory.getTriangulo(2,1,3);
        Triangulo isosceles = TrianguloFactory.getTriangulo(2,2,3);
        Triangulo equilatero = TrianguloFactory.getTriangulo(2,2,2);
        
        escaleno.mostrarnombre();
        isosceles.mostrarnombre();
        equilatero.mostrarnombre();

	}

}
