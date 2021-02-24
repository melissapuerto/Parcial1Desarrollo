package com.mayab.desarrollo.patrones.comportamiento.observer;

public class CrewVuelo implements Observer{

	public CrewVuelo(Vuelo vuelo) {
		vuelo.registerObserver(this);
	}

	@Override
	public void update (String fromto, String hora, String status, String dia, String puerta) {
		anunciar(fromto, hora, status, dia, puerta);
	}
	
	public void anunciar(String fromto, String hora, String status, String dia, String puerta)
	{
		System.out.println(" ATENCION CREW. Vuelo:" + fromto+" Horario: "+ hora+" Dia: "+ dia+" Puerta:"+ puerta+ " Status:"+status);
		
	}

}
