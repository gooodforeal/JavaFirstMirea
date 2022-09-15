package ru.mirea.task25;


public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Shapes
        Shape circleObject = new Circle();
        Shape rectangleObject = new Rectangle();
        // Decorated shapes
        Shape redRectangleObject = new RedShapeDecorator(rectangleObject);
        Shape redCircleObject = new RedShapeDecorator(circleObject);
        // Drawing
        redRectangleObject.draw();
        redCircleObject.draw();
    }
}
