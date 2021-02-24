package com.mayab.desarrollo.patrones.estructura.decorator;

public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo archivo = new ArchivoTexto();
		Archivo archivo1= new ArchivoTexto();
		Archivo archivoN = new ArchivoTexto();
		
		archivo= new DecoratorZip(archivo); //Archivo zipeado
		archivo1= new DecoratorEncriptar(archivo1); 
		archivo1=new DecoratorZip(archivo1);  //el archivo 1 va a zipearse y encriptarse
		
		System.out.println(archivo.leer());
		System.out.println(archivo1.leer());
		System.out.println(archivoN.escribir()); //archivo que solo escribe



	}

}
