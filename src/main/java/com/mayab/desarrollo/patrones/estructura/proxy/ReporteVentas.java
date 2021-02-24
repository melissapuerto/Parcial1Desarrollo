package com.mayab.desarrollo.patrones.estructura.proxy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReporteVentas implements Reporte {

 
	
	public ReporteVentas() {
		// TODO Auto-generated constructor stub
		 
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println("leyendo");
		File file = new File("ejemplo.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String linea = scanner.nextLine();
				System.out.println(linea);

						
				
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	   }
		
	

	@Override
	public void escribir(String texto) {
		// TODO Auto-generated method stub
		FileWriter flwriter = null;

		try {
			flwriter = new FileWriter("ejemplo.txt");
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
				bfwriter.write("Reporte:"+texto);
			bfwriter.close();
			System.out.println("Reporte escrito satisfactoriamente...");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
	}


		
	}

