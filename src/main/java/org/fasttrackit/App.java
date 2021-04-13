package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {
        ObjectChild object = new ObjectChild();
        System.out.println(object.company + " has a profit of " + object.profit + " and an anual growth of " + object.growth + ".");
        System.out.println(" ");

        int gdp=0;
        Encapsulation economy = new Encapsulation();

        economy.setCountry("Romania");
        economy.setYear(2020);
        economy.setPrivateconsumption(120000);
        economy.setGrossinvestment(80000);
        economy.setGovernmentinvestment(50000);
        economy.setGovernmentspending(15000);
        economy.setExports(50000);
        economy.setImports(75000);

        gdp= economy.getPrivateconsumption() + economy.getGovernmentinvestment() + economy.getGrossinvestment() + economy.getGovernmentspending() + (economy.getExports() - economy.getImports());

        System.out.println("Gross Domestic Product of " + economy.getCountry() + " in the year " + economy.getYear() + " is : " + gdp + " 10^6 Euros.");

    }
}
