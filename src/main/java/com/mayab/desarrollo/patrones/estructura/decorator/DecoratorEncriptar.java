package com.mayab.desarrollo.patrones.estructura.decorator;

public class DecoratorEncriptar extends Decorator{
private Archivo archivo;

	public DecoratorEncriptar(Archivo archivo) {
		// TODO Auto-generated constructor stub
		this.archivo=archivo;

	}

	
	@Override
	public String leer()
	{
		return archivo.leer()+" encriptando datos";
	}
	
	@Override
	public String escribir()
	{
		return archivo.escribir()+" encriptando datos";
	}
}
