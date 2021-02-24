package com.mayab.desarrollo.patrones.comportamiento.observer;

import java.util.ArrayList;

//Subject concreto
public class Vuelo implements Subject {
	String fromto;
	String hora;
	String status;
	String dia;
	String puerta;
	private ArrayList<Observer> observers;

	public Vuelo() {
		
		observers= new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(observers.indexOf(o));
		
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(fromto, hora, status, dia, puerta);
		}
	}

	
	public String getFromto() {
		return fromto;
	}

	public String getHora() {
		return hora;
	}

	public String getStatus() {
		return status;
	}

	public String getDia() {
		return dia;
	}

	public String getPuerta() {
		return puerta;

	}


	public void setFromto(String fromto) {
		this.fromto = fromto;
		cambioVuelo();

	}

	public void setHora(String hora) {
		this.hora = hora;
		cambioVuelo();

	}

	public void setStatus(String status) {
		this.status = status;
		cambioVuelo();

	}

	public void setDia(String dia) {
		this.dia = dia;
		cambioVuelo();

	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
		cambioVuelo();

	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
		cambioVuelo();

	}

	public void setInfo (String fromto, String hora, String status, String dia, String puerta){
		this.fromto = fromto;
		this.hora = hora;
		this.status = status;
		this.dia = dia;
		this.puerta = puerta;
		cambioVuelo();
	}
	
	public void cambioVuelo() {
		notifyObservers();
	}
	
}
