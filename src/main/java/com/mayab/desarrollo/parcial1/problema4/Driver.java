package com.mayab.desarrollo.parcial1.problema4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasededatosA basededatosa= new BasededatosA();
		basededatosa.persistencia("UPDATE Customers SET ContactName = Ejemplo WHERE CustomerID = 1;");
		BasededatosB basededatosb= new BasededatosB();
		basededatosb.persistencia("UPDATE Customers SET ContactName = Ejemplo WHERE CustomerID = 1;");
		BasededatosC basededatosc= new BasededatosC();
		basededatosc.persistencia("UPDATE Customers SET ContactName = Ejemplo WHERE CustomerID = 1;");


	}

}
