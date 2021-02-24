package com.mayab.desarrollo.patrones.comportamiento.template;

public class DriverArchivo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcesarJson json = new ProcesarJson();
		ProcesarExcel excel = new ProcesarExcel();
		System.out.println("**Archivo JSON");
		json.procesar();
		System.out.println("**Archivo Excel");
		excel.procesar();

	}

}
