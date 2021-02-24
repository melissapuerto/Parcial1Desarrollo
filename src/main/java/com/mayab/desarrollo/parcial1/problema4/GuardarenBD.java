package com.mayab.desarrollo.parcial1.problema4;

public abstract class GuardarenBD {
	
	final void persistencia(String sentencia) {
		abrirConexion();
		crearSentencia(sentencia);
		ejecutarSentencia(sentencia);
		
	}
	
	abstract String crearSentencia(String sentencia);
	void abrirConexion() {
		System.out.println("Abriendo");
	}
	void ejecutarSentencia(String sentencia) {
		System.out.println("Ejecutando..."+crearSentencia(sentencia));
		
	}
	

}
