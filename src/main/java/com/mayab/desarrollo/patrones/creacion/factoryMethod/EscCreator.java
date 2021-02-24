package com.mayab.desarrollo.patrones.creacion.factoryMethod;

public class EscCreator extends TriangleCreator{

	@Override
	Triangle createTriangle(int a, int b, int c) {
		if (a!=b && b!=c && c!=a)
		{
			return new TriEsc();
		}
		else
		{
			return null;
		}
	}


}
