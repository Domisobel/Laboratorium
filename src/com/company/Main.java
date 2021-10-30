package com.company;

public class Main {

    public static void main(String[] args) {
        Phone motorola=new Phone("Motorola","E8",14);
        motorola.os="Motorola";
        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.weight = 3.5;
        dog.age = 2;
        dog.alive = true;

        Car skoda =new Car();
        skoda.model ="Skoda Octvia";
        skoda.producer="Skoda";
        skoda.weight = 1334.0;
        skoda.doors =5;
        skoda.value=4000.0;
        skoda.year=1996;

        Human dominika =new Human("Dominika","Migus");
        dominika.pet=dog;
        dominika.phone=motorola;




        Double weightBeforeBreakfast=dog.getWeight();

        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();
        dog.feed(0.5);

        System.out.println("Przytylem "+(dog.getWeight()-weightBeforeBreakfast)+"kg");
        dominika.setSalary(1500.0);
        dominika.getSalary();
        dominika.setCar(skoda);
        dominika.getCar();
        System.out.println(dominika);
    }
}
