package com.mayab.desarrollo.patrones.estructura.adapter;

public class EmpleadoNuevo implements PersonaNueva {
String nombre;
String edad;

	
public EmpleadoNuevo(String nombre, String edad) {
	this.nombre = nombre;
	this.edad = edad;
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return this.nombre;
}
@Override
public String getEdad() {
	// TODO Auto-generated method stub
	return this.edad;
}

}
