package com.mayab.desarrollo.patrones.comportamiento.observer;

public interface Subject {
public void registerObserver (Observer o);
public void removeObserver(Observer o);
public void notifyObservers();

}
