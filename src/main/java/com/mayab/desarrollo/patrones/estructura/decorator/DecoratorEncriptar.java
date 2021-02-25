package com.mayab.desarrollo.patrones.estructura.decorator;

public class DecoratorEncriptar extends Decorator{
 Archivo archivo;

	public DecoratorEncriptar(Archivo archivo) {
		// TODO Auto-generated constructor stub
		this.archivo=archivo;

	}

	
	@Override
	public String leer()
	{
		return this.archivo.leer()+" encriptando datos";
	}
	
	@Override
	public String escribir()
	{
		return this.archivo.escribir()+" encriptando datos";
	}
}
