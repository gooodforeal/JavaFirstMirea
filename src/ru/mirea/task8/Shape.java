package ru.mirea.task8;
import java.util.Random;
import java.awt.*;


public abstract class Shape {
    private Color color;
    private int x1, y1;
    Shape() {
        Random rnd= new Random();
        int R = rnd.nextInt(255);
        int G = rnd.nextInt(255);
        int B = rnd.nextInt(255);
        this.color = new Color(R, G, B);
        this.x1 = rnd.nextInt(1300);
        this.y1 = rnd.nextInt(700);
    }
    public Color getColor() {
        return color;
    }
    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
}

class Rectangle extends Shape {
    int height, width;
    Rectangle() {
        super();
        Random rnd= new Random();
        this.height = rnd.nextInt(350);
        this.width = rnd.nextInt(350);
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
}

class Circle extends Shape {
    int radius;
    Circle() {
        super();
        Random rnd= new Random();
        this.radius = rnd.nextInt(350);
    }
    public int getRadius() {
        return radius;
    }
}
