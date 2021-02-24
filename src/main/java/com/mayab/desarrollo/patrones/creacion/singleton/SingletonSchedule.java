package com.mayab.desarrollo.patrones.creacion.singleton;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class SingletonSchedule {
	
	private HashMap<String, String> schedule = new HashMap<String, String>();
	private static SingletonSchedule instance;
	
	private SingletonSchedule()
	{
		
	}
	
	public static SingletonSchedule getInstance()
	{ 
		//lazy initialization
		if (instance==null)
		{
			instance=new SingletonSchedule();
		}
		return instance;
		
	}
	
	public void agregarClase(String hora, String clase)
	{
		 schedule.put(hora, clase);
	}
	
	public void print() {
		for (Iterator<Entry<String, String>> iterator = schedule.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, String> me = iterator.next();
			System.out.println("Hora: "+ me.getKey()+" & Clase: " + me.getValue());
		}
	}
	
}
