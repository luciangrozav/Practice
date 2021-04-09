package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {
        ObjectChild object = new ObjectChild();
        System.out.println(object.company + " has a profit of " + object.profit + " and an anual growth of " + object.growth + ".");
    }
}
