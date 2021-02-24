package com.mayab.desarrollo.parcial1.problema1;
import java.util.ArrayList;

public class Compania implements Sujeto{

	private ArrayList<Double> gastos;
	private Double gastoMaximo;
	private Observador observador;
	
	public Compania(Double gastoMaximo) {
		this.gastoMaximo = gastoMaximo;
		gastos = new ArrayList<>();
	}
	
	public void agregarGasto(Double gasto) {
		gastos.add(gasto);
		if (gasto > gastoMaximo) {
			notificar();
		}
	}
	
	//Enlazar observador
	public void enlazar(Observador o) {
		observador = o;
	}
	
	@Override
	public void notificar() {
		observador.update();		
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

	public Observador getObservador() {
		return observador;
	}

	public void setObservador(Observador observador) {
		this.observador = observador;
	}
	

}
