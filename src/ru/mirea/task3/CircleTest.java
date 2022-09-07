package ru.mirea.task3;

class Circle {
    double radius;

    Circle(double argRadius) {
        radius = argRadius;
    }

    public double getLength() {
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return 3.14 * radius * radius;
    }

    public void setRadius(double argRadius) {
        this.radius = argRadius;
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle circleObject = new Circle(10);
        circleObject.setRadius(5);
        System.out.println("Circle: radius=" + circleObject.getRadius());
        System.out.println("square=" + circleObject.getSquare() + ", length=" + circleObject.getLength());
    }
}





