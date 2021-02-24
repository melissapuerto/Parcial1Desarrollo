package com.mayab.desarrollo.patrones.creacion.abstractFactory;

public class MueblesStore {
	MueblesFactory factory;
	Mesa mesa;
	Silla silla;
	Sofa sofa;
	public void crearSala(String tipo) {

		
		if (tipo=="Moderna" || tipo=="moderna")
		{
		factory = new MueblesModernosFactory();
		System.out.println("**Sala Moderna**");

		}
		else if (tipo=="Ochentera" || tipo =="ochentera") {
			factory = new MueblesOchenterosFactory();
			System.out.println("**Sala Ochentera**");


		}
		else
		{
			factory = new MueblesVictorianosFactory();
			System.out.println("***Sala Victoriana***");



		}

		mesa=factory.createMesa();
		silla=factory.createSilla();
		sofa = factory.createSofa();

	}
	
	public void entregarSala() {
		System.out.println(mesa.getType());
		System.out.println(silla.getType());
		System.out.println(sofa.getType());

	}
}