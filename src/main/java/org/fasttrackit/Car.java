package org.fasttrackit;

public abstract class Car {

    int price;
    //metode
    abstract double power();
    public abstract String output();

    //constructor
    public Car(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }

}
