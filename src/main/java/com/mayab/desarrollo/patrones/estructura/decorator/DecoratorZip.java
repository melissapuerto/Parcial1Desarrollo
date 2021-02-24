package com.mayab.desarrollo.patrones.estructura.decorator;

public class DecoratorZip extends Decorator{

	Archivo archivo;
	
	public DecoratorZip(Archivo archivo) {
		this.archivo=archivo;
		
	}
	
	@Override
	public String leer()
	{
		return archivo.leer()+" zipeando datos";
	}
	
	@Override
	public String escribir()
	{
		return archivo.escribir()+" zipeandos datos";
	}

	
	
	
}
