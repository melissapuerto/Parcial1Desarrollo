package com.mayab.desarrollo.patrones.creacion.abstractFactory;

public class MueblesOchenterosFactory implements MueblesFactory {

	@Override
	public Silla createSilla() {
		// TODO Auto-generated method stub
		return new SillaOchentera();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaOchentero();
	}

	@Override
	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaOchentera();
	}

}
