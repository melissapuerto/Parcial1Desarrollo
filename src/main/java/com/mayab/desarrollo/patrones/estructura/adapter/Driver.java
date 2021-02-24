package com.mayab.desarrollo.patrones.estructura.adapter;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		EmpleadoViejo empleadoviejo=new EmpleadoViejo("Miranda", "Torres","11/01/2000");
		EmpleadoNuevo empleadonuevo=new EmpleadoNuevo("Meli Puerto","23");
		AdptadorViejaANueva adapter = new AdptadorViejaANueva(empleadoviejo);
		ArrayList<PersonaNueva> personas=new ArrayList<PersonaNueva>();
		personas.add(empleadonuevo);
		personas.add(adapter);
	
	for(int i=0;i<personas.size();i++)
	{
		System.out.println("Nombre: "+personas.get(i).getName()+" -Edad: "+personas.get(i).getEdad());

	}
	}

}
