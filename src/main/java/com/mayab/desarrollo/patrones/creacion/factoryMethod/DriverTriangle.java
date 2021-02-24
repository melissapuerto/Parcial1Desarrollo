package com.mayab.desarrollo.patrones.creacion.factoryMethod;

public class DriverTriangle {

	public DriverTriangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleCreator esc = new EscCreator();
		TriangleCreator eq = new EqCreator();
		TriangleCreator isos = new IsosCreator();
		Triangle escaleno= esc.createTriangle(3, 2, 1);
		Triangle equilatero= eq.createTriangle(2, 2, 2);
		Triangle isoceless= isos.createTriangle(2, 3, 2);
	
		System.out.println(escaleno.getTipo	());
		System.out.println(equilatero.getTipo());
		System.out.println(isoceless.getTipo());


	}

}
