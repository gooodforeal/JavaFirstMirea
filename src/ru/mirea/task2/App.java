package ru.mirea.task2;
import java.util.ArrayList;


class Shape {
    double x;
    double y;

    Shape(double argX, double argY) {
        x = argX;
        y = argY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

     public String toString() {
        return "Shape: " + "x=" + x + ", y=" + y;
     }
};

class Ball {
    String color;
    int size;

    Ball(String argColor, int argSize) {
        color = argColor;
        size = argSize;
    }

    public String toString() {
        return "Ball: colour=" + color + ", size=" + size;
    }
};

class Book {
    String name;
    String author;
    int pagesCount;

    Book(String argName, String argAuthor, int argPagesCount) {
        name = argName;
        author = argAuthor;
        pagesCount = argPagesCount;
    }

    public String toString() {
        return "Book: name=" + name + ", author=" + author + ", pages=" + pagesCount;
    }
};

class Dog {
    String name;
    int age;

    Dog(String argName, int argAge) {
        name = argName;
        age = argAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPeopleAge() {
        return age * 7;
    }

    public String toString() {
        return "Dog: name=" + name + ", age=" + age;
    }
};

class TestDog {
    ArrayList<Dog> arrayDogs = new ArrayList<Dog>();
    public void append(Dog argDog) {
        arrayDogs.add(argDog);
    }

    public String toString() {
        String tmp;
        String result = "All dogs:\n";
        for (int i = 0; i < arrayDogs.size(); i++) {
            tmp = arrayDogs.get(i).toString() + "\n";
            result += tmp;
        }
        return  result;
    }
}

public class App {
    public static void main(String[] args) {
        // Класс Shape
        Shape shapeObject = new Shape(12, 33);
        System.out.println(shapeObject.toString());
        // Класс Ball
        Ball objectBall = new Ball("Yellow", 5);
        System.out.println(objectBall.toString());
        // Класс Book
        Book objectBook = new Book("Getting thinks done", "David Allen", 416);
        System.out.println(objectBook.toString());
        // Класс Dog
        Dog objectDog1 = new Dog("Bob", 3);
        Dog objectDog2 = new Dog("Carl", 5);
        Dog objectDog3 = new Dog("Rebecca", 7);
        System.out.println(objectDog1.toString());
        System.out.println("Dog: name=" + objectDog2.getName() + ", age=" + objectDog2.getAge());
        System.out.println("Dog: name=" + objectDog3.getName() + ", people_age=" + objectDog3.getPeopleAge());
        // Класс TestDog
        TestDog objectTestDog = new TestDog();
        objectTestDog.append(objectDog1);
        objectTestDog.append(objectDog2);
        objectTestDog.append(objectDog3);
        System.out.println(objectTestDog.toString());
    }
}
