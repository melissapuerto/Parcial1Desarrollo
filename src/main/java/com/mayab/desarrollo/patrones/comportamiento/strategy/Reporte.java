package com.mayab.desarrollo.patrones.comportamiento.strategy;

import java.util.ArrayList;

//clase equivalente al "Duck"
public abstract class Reporte {
	ArrayList <Articulo> articulos = new ArrayList<Articulo>();
	//Vamos a tener una lista de artículos dentro de reporte , para que cuando
	//llamemos a exportar podamos imprimir la lista de artículos

	ExportB exportb;
	
	public Reporte() {
		// TODO Auto-generated constructor stub
	}
		
	public void setExportB(ExportB eb){
			
		exportb=eb;
	}
	public void performExportB() {
		exportb.exportar();

		for (int i=0; i<articulos.size();i++)
		{
			System.out.println("Nombre: " +articulos.get(i).getNombre()+" Precio: "+articulos.get(i).getPrecio());
		}
	}
	
	public void agregarArticulo(Articulo art) {
		articulos.add(art);
	}
	abstract void display();

}
