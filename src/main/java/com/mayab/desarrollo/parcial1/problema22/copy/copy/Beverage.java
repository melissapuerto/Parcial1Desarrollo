package com.mayab.desarrollo.parcial1.problema22.copy.copy;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}