package com.mayab.desarrollo.patrones.estructura.decorator;

public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo archivoComprimido = new ArchivoTexto();
		Archivo archivoEncriptado = new ArchivoTexto();
		

		archivoEncriptado= new DecoratorEncriptar(archivoEncriptado);
		System.out.println("Escribiendo archivo encriptado: "+archivoEncriptado.escribir());
		
		archivoComprimido= new DecoratorZip(archivoComprimido); //Archivo zipeado
		System.out.println("Leyendo un archivo comprimido: "+archivoComprimido.leer());
		

		archivoEncriptado = new DecoratorZip(archivoEncriptado);
		System.out.println("Escribiendo archivo encriptado y zipeado: "+archivoEncriptado.escribir());



	}

}
