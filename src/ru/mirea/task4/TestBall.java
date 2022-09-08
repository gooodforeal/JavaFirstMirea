package ru.mirea.task4;


class Ball {
    private double x = 0.0;
    private double y = 0.0;

    Ball(double argX, double argY) {
        x = argX;
        y = argY;
    }

    Ball() {

    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public String toString() {
        return "Ball: x=" + x + ", y=" + y;
    }
}

public class TestBall {
    public static void main(String[] args) {
        Ball objectBall = new Ball(12, 6);
        objectBall.move(-7, 3);
        objectBall.setXY(1, 1);
        System.out.println(objectBall.toString());
        Ball objectBall1 = new Ball();
        objectBall1.setX(12);
        objectBall1.setY(0);
        System.out.println("Ball: x=" + objectBall1.getX() + ", y=" + objectBall1.getY());
    }
}
