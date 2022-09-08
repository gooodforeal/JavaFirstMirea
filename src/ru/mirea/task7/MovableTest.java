package ru.mirea.task7;

interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "Point: x=" + this.x + ", y=" + this.y + ", x-speed=" + this.xSpeed + ", y-speed=" + this.ySpeed;
    }
    public void moveUp() {
        this.y += ySpeed;
    }
    public void moveDown() {
        this.y -= ySpeed;
    }
    public void moveLeft() {
        this.x -= xSpeed;
    }
    public void moveRight() {
        this.x += xSpeed;
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public String toString() {
        return "Circle: center=" + this.center + "\n" + "radius=" + this.radius;
    }
    public void moveUp() {
        this.center.moveUp();
    }
    public void moveDown() {
        this.center.moveDown();
    }
    public void moveLeft() {
        this.center.moveLeft();
    }
    public void moveRight() {
        this.center.moveRight();
    }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public String toString() {
        return "Rectangle: top-left=" + this.topLeft + ", bottom-right=" + this.bottomRight;
    }
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }
}

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint objectPoint = new MovablePoint(1, 1, 1, 1);
        MovableCircle objectMovableCircle = new MovableCircle(1, 1, 1, 1, 1);
        MovableRectangle objectMovableRectangle = new MovableRectangle(2, 2, 1, 3, 1,1);
        objectPoint.moveRight();
        objectMovableCircle.moveLeft();
        objectMovableRectangle.moveUp();
        System.out.println(objectPoint);
        System.out.println(objectMovableCircle);
        System.out.println(objectMovableRectangle);
    }
}
