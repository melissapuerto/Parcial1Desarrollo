package com.mayab.desarrollo.parcial1.problema4;

public class BasededatosA extends GuardarenBD{

	@Override
	String crearSentencia(String sentencia) {
		// TODO Auto-generated method stub
		return sentencia.toUpperCase();
	}

}
