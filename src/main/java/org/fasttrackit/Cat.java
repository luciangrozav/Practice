package org.fasttrackit;

public class Cat implements Animal {

    String name;
    int speed=30;
    int food=10;

    public void eat(int a)
    {
        food+=a;
    }
    public void run(int a)
    {
        speed+=a;
    }
    public int jump (int a)
    {
        return a*a;
    }
    public void printAnimal()
    {
        System.out.println("Quantity of food eaten: " + food + " ; Run speed: " + speed + ".");
    }

}
