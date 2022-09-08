package ru.mirea.task5;


abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String toString();
}

class BullDog extends Dog {
    private int strength;

    public BullDog(String name, int age, int strength) {
        super(name, age);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String toString() {
        String tmp = "BullDog: name=" + super.getName() + ", age=" + super.getAge();
        tmp += ", strength=" + this.getStrength();
        return tmp;
    }
}

class York extends Dog {
    private boolean fluffy;

    public York(String name, int age, boolean fluffy) {
        super(name, age);
        this.fluffy = fluffy;
    }

    public boolean isFluffy() {
        return fluffy;
    }

    public void setFluffy(boolean fluffy) {
        this.fluffy = fluffy;
    }

    public String toString() {
        String tmp = "York: name=" + super.getName() + ", age=" + super.getAge();
        tmp += ", is_fluffy=" + this.isFluffy();
        return tmp;
    }
}

public class TestDog {
    public static void main(String[] args) {
        // BullDog test
        BullDog objectBullDog = new BullDog("Ben", 7, 10);
        objectBullDog.setAge(5);
        objectBullDog.setStrength(9);
        System.out.println(objectBullDog.toString());
        // York test
        York objectYork = new York("Jack", 2, true);
        objectYork.setFluffy(false);
        System.out.println(objectYork.toString());

    }
}
