package com.mayab.desarrollo.patrones.comportamiento.observer;

public class Pasajero implements Observer{

	public String nombre;
	public Pasajero(String nombre, Vuelo vuelo) {
		this.nombre=nombre;
		vuelo.registerObserver(this);
	}

	@Override
	public void update (String fromto, String hora, String status, String dia, String puerta) {
		anunciar(fromto, hora, status, dia, puerta);
	}
	
	public void anunciar(String fromto, String hora, String status, String dia, String puerta)
	{
		System.out.println("--Pasajero "+this.nombre+" Vuelo:" + fromto+" Horario: "+ hora+" Dia: "+ dia+" Puerta:"+ puerta+ " Status:"+status);
		if (status=="atrasado")
		{
			System.out.println("El vuelo ha sufrido un retraso");
		}
		else if(status=="a tiempo") {
			System.out.println("Puede abordar el avión");
		}
		else {
			System.out.println("El vuelo se canceló, favor de cambiarse a otro vuelo");
		}
	}

}
