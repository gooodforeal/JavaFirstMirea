package ru.mirea.task28;


public class Auto {
    private String name;
    private int price;
    // No static
    public class InnerNoStatic {
        public int getPrice() {
            return price;
        }
    }
    // Static
    public static class InnerStatic {
        InnerStatic() {
            System.out.println("Inner Static!");
        }
    }
    // Local
    public String getName() {
        class Name {
            public String n = name;
        }
        Name name = new Name();
        return "Local: " + name.n;
    }
    public Auto(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
