package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("Gross Domestic Product of " + economy.getCountry() + " in the year " + economy.getYear() + " was : " + gdp + " 10^6 Euros.");

        System.out.println(" ");
        System.out.println(Method.operation(8, 8)); // Polimorfism static

        System.out.println(" ");
        System.out.println(Method.operation(4.2, 8.6));  // Polimorfism static- supraincarcarea metodei

        System.out.println(" ");
        System.out.println(Method.operation(11, 55, 30));  // Polimorfism static- supraincarcarea metodei

        // Suprascrierea metodei- Polimorfism Runtime

        System.out.println(" ");

        Method k = new Method();
        System.out.println(k.methoddynamic(9));
        System.out.println(" ");

        Method m = new Method2();
        System.out.println(m.methoddynamic(9)); // Suprascrierea metodei methoddynamic
        System.out.println(" ");

        Method n = new Method3();
        System.out.println(n.methoddynamic(9)); // Suprascrierea metodei methoddynamic
        System.out.println(" ");

        //typecasting
        int z=0;
        z = ((Method2)m).typecasting(100); // metoda typecasting se afla in clasa Method2, iar obiectul m de tip Method2 are referinta stocata in clasa Method.
        System.out.println(z);
        System.out.println(" ");

        Car masina = new Volkswagen(12500, 85);  // Clasele abstracte nu pot avea obiecte, de aceea se declara new Volkswagen() in loc de new Car(); doar referinta variabilei se salveaza in clasa Car
        System.out.println(masina.output());

        Human human = new Human();

        human.setName("Lucian");
        human.setAge(27);
        human.setHeight(180);
        human.setWeight(90);
        human.setJob("Engineer");
        human.setNationality("Romanian");

        List<Human> humans = new ArrayList<>();

        humans.add(human);

        for(Human human1: humans)
            System.out.println(human1.getName()  + " " + human1.getAge() + " " + human1.getHeight() + " " + human1.getWeight()+ " " +human1.getNationality() + " " + human1.getJob() );

        System.out.println(" ");

        ClasaInterface clasa = new ClasaInterface();
        clasa.display();
        System.out.println(clasa.grow(Interfata.nr));


    }
}
