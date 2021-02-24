package com.mayab.desarrollo.patrones.estructura.adapter;

public class EmpleadoViejo implements PersonaVieja {
String nombre;
String apellido;
String fechanacimiento;


	public EmpleadoViejo(String nombre, String apellido, String fechanacimiento) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechanacimiento = fechanacimiento;
}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return apellido;
	}

	@Override
	public String getFechaNacimiento() {
		// TODO Auto-generated method stub
		return fechanacimiento;
	}

}
