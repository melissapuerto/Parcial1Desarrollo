package com.mayab.desarrollo.parcial1.problema22;

public class StarbuzzCoffee {
	 public static void main(String[] args) {
	        Beverage beverage = new Espresso();
	        
	        Beverage beverage2 = new HouseBlend();
	        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

	        beverage2.setSize("Beverage.TALL");
	        
	        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	    }
	}