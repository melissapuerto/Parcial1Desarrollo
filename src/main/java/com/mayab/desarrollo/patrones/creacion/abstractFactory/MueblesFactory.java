package com.mayab.desarrollo.patrones.creacion.abstractFactory;

public interface MueblesFactory {
	public Silla createSilla();
	
	public Sofa createSofa();

	public Mesa createMesa();
	
}
