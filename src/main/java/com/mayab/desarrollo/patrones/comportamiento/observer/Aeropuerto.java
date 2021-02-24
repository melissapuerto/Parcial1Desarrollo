package com.mayab.desarrollo.patrones.comportamiento.observer;

public class Aeropuerto {

	public static void main(String[] args) {
		Vuelo vuelo= new Vuelo();
		vuelo.setInfo("MEX-USA", "2:00PM", "atrasado", "2 de enero", "4B");
		CrewVuelo crew = new CrewVuelo(vuelo);
		Pasajero pasajero= new Pasajero("Sofia del Corno",vuelo);
		DisplayAeropuerto display=new DisplayAeropuerto(vuelo);
		vuelo.setInfo("MEX-USA", "2:00PM", "atrasado", "2 de enero", "4D");
		vuelo.setStatus("a tiempo");
		vuelo.setStatus("cancelado");

}
}	