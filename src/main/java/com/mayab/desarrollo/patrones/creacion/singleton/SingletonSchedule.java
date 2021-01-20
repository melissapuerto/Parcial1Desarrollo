package com.mayab.desarrollo.patrones.creacion.singleton;
//Un profesor de clases en 3 escuelas, los coordinadores de las 3 escuelas
//tineen que acceder a la misma instancia para poder garantizar
//que estan viendo el mismo horario
//van a asignar una clase a cada uno de ellos

import java.util.HashMap;
import java.util.Map;

public class SingletonSchedule {
	//HashMap
	//lunes-4om: claseA
	//lunes 5pm: Clase b

	private HashMap<String, String> schedule = new HashMap<String, String>();
	private static SingletonSchedule instance;
	private SingletonSchedule()
	{
		
	}
	public static SingletonSchedule getInstance()
	{
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
		for (Map.Entry me: schedule.entrySet())
		{
			System.out.println("Key: "+ me.getKey()+" & Value: " + me.getValue());
		}
	}
	
}
