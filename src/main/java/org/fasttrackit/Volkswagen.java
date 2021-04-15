package org.fasttrackit;

public class Volkswagen  extends Car{

    double motorpower; // kW

    //constructor
    public Volkswagen(int price, double motorpower)
    {
        super(price);
        this.motorpower=motorpower;
    }

    @Override
    double power() {
        return 1.34*motorpower;
    }

    @Override
    public String output() {
        return "The price of an Volkswagen with " + power() + " hoursepower is: " + super.getPrice() + " Euros.";
    }
}
