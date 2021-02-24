package com.mayab.desarrollo.parcial1.problema22;


public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
	public String getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}
    
    @Override
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