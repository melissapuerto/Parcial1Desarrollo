package com.mayab.desarrollo.parcial1.problema1;


/**
 * Interfaz para el sujeto que va ser observado
 *
 */
public interface Sujeto {
	public void notificar(String modo);
	public void registerObserver (Observer o);
	public void removeObserver(Observer o);
}
