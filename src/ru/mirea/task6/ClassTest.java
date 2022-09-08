package ru.mirea.task6;


interface Nameable{

    String getName();
}

class Planet implements Nameable{
    private String name;

    Planet(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car implements Nameable{
    private String name;

    Car(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Phone implements Nameable{
    private String name;

    Phone(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ClassTest {
    public static void main(String[] args) {
        Planet objectPlanet = new Planet("Earth");
        Car objectCar = new Car("BMW");
        Phone objectPhone = new Phone("Iphone");
        System.out.println("Planet: " + objectPlanet.getName());
        System.out.println("Car: " + objectCar.getName());
        System.out.println("Phone: " + objectPhone.getName());
    }
}
