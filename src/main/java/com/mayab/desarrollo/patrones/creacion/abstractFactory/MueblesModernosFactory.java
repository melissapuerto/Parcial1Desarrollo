package com.mayab.desarrollo.patrones.creacion.abstractFactory;

public class MueblesModernosFactory implements MueblesFactory{
	
	

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaModerno();
	}

	@Override
	public Silla createSilla() {
		// TODO Auto-generated method stub
		return new SillaModerna();
	}

	@Override
	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaModerna();
	}
	

}
