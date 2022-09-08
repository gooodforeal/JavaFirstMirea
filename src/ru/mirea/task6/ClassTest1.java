package ru.mirea.task6;


interface Pricable{

    int getPrice();
}

class Book implements Pricable{
    private int price;

    Book(int price){

        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Pen implements Pricable{
    private int price;

    Pen(int price){

        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Bike implements Pricable{
    private int price;

    Bike(int price){

        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class ClassTest1 {
    public static void main(String[] args) {
        Book objectBook = new Book(127);
        Pen objectPen = new Pen(50);
        Bike objectBike = new Bike(9999);
        System.out.println("Book: " + objectBook.getPrice());
        System.out.println("Pen: " + objectPen.getPrice());
        System.out.println("Bike: " + objectBike.getPrice());
    }
}
