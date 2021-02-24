package com.mayab.desarrollo.parcial1.problema22;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    
@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
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