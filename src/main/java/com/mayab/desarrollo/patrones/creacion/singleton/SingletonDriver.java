package com.mayab.desarrollo.patrones.creacion.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		
		Coordinador coor1=new Coordinador("nombre1", "escuela1");
		Coordinador coor2=new Coordinador("nombre2", "escuela2");
		Coordinador coor3=new Coordinador("nombre3", "escuela3");
		
		coor1.agregarClase("lun4pm", "clase1");
		coor1.agregarClase("lun4pm", "clase2");
		coor1.agregarClase("lun5pm", "clase3");
		//Iterar sobre las llaves
		System.out.println("done");
		SingletonSchedule.getInstance().print();


	}

}
