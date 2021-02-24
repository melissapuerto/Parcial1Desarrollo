package com.mayab.desarrollo.patrones.estructura.proxy;

import com.mayab.desarrollo.patrones.estructura.decorator.Archivo;
import com.mayab.desarrollo.patrones.estructura.decorator.ArchivoTexto;
import com.mayab.desarrollo.patrones.estructura.decorator.DecoratorEncriptar;
import com.mayab.desarrollo.patrones.estructura.decorator.DecoratorZip;

public class ClienteDriver {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Empleado administrador = new Empleado("administrador");
Empleado empleado = new Empleado ("empleado");

ReporteVentasProxy proxyadmin = new ReporteVentasProxy(administrador);
ReporteVentasProxy proxyempleado = new ReporteVentasProxy(empleado);

System.out.println("*Acciones del administrador**");
proxyadmin.escribir("Escritura ejemplo admin");
proxyadmin.leer();

System.out.println("*Acciones del empleado**");
proxyempleado.escribir("Escritura ejemplo empleado");
proxyempleado.leer();


}
}
