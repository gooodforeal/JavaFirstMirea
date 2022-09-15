package ru.mirea.task25;


public class RedShapeDecorator extends ShapeDecorator {
    public Shape shape;
    public RedShapeDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }
    public void draw() {
        setRedBorder();
        shape.draw();
        System.out.println("with red border");
    }
    private void setRedBorder() {
        System.out.println("Setting red border...");
    }
}
