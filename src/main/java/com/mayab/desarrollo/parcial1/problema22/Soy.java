package com.mayab.desarrollo.parcial1.problema22;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getSize() {
    	return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
   	 double cost = beverage.cost();
   	 if (getSize() == "Beverage.TALL") {
   	 cost += .10;
   	 } else if (getSize() == "Beverage.GRANDE") {
   	 cost += .15;
   	 } else if (getSize() == "Beverage.VENTI") {
   	 cost += .20;
   	 }
   	 return cost;
   	 }
    

	
}