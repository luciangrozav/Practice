package org.fasttrackit;

public class Dog implements Animal {

    String name;
    int speed=20;
    int food=20;

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
        return a*a*a;
    }
    public void printAnimal()
    {
        System.out.println("Quantity of food eaten: " + food + " ; Run speed: " + speed + ".");
    }

}
