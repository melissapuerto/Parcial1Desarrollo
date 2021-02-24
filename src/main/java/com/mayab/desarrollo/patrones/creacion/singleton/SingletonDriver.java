package com.mayab.desarrollo.patrones.creacion.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		
		Coordinador coordinador1=new Coordinador("nombre1", "escuela1");
		
		coordinador1.agregarClase("lun4am", "clase1");
		coordinador1.agregarClase("lun4am", "clase2");
		coordinador1.agregarClase("lun5pm", "clase3");

		SingletonSchedule.getInstance().print();

		//solo se guardaran 2 clases, debido a que la clase 1 y 2 chocan

	}

}
