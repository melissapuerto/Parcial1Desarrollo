package com.mayab.desarrollo.patrones.creacion.factoryMethod;

public class IsosCreator extends TriangleCreator{

	@Override
	Triangle createTriangle(int a, int b, int c) {
		// TODO Auto-generated method stub
		if ((a==b && c!=a) || (b==c && b!=a) || (a==c && c!=b))
		{
			return new TriIsos();
		}
		else
		{
			return null;
		}
	}

}
