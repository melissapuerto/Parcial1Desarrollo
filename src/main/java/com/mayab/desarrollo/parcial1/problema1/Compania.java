package com.mayab.desarrollo.parcial1.problema1;
import java.util.ArrayList;




public class Compania implements Sujeto{

	private ArrayList<Double> gastos;
	private Double gastoMaximo;
	private ArrayList<Observer> observador;
	private String modo;
	
	public Compania(Double gastoMaximo, String modo) {
		this.gastoMaximo = gastoMaximo;
		gastos = new ArrayList<>();
		this.modo=modo;
		observador= new ArrayList<Observer>();

	}
	
	public void agregarGasto(Double gasto) {
		gastos.add(gasto);
		if (gasto > gastoMaximo) {
			notificar(modo);
			System.out.println(getGastos());

		}
	}
	
	
	@Override
	public void notificar(String modo) {
		for (int i = 0; i < observador.size(); i++) {
			Observer observer = (Observer)observador.get(i);
			observer.update(modo);
		}		
	}

	public ArrayList<Double> getGastos() {
		return gastos;
	}

	public void setGastos(ArrayList<Double> gastos) {
		this.gastos = gastos;
	}

	public Double getGastoMaximo() {
		return gastoMaximo;
	}

	public void setGastoMaximo(Double gastoMaximo) {
		this.gastoMaximo = gastoMaximo;
	}


	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}

	@Override
	public void registerObserver(Observer o) {
		observador.add(o);

		
	}

	@Override
	public void removeObserver(Observer o) {
		observador.remove(observador.indexOf(o));

	}

	
	
	

}
