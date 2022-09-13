package ru.mirea.task19;


public class App {
    public static void main(String[] args) {
        try {
            new RightTriangle(30, 50, 90);
        }
        catch (TriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
