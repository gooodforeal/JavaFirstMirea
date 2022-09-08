package ru.mirea.task5;


abstract class Dish {
    private String name;
    private String shape;
    private int size;

    public Dish(String name, String shape, int size) {
        this.name = name;
        this.shape = shape;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getShape() {
        return shape;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public abstract String toString();
}

class Cup extends Dish {
    private String cupType;

    public Cup(String name, String shape, int size, String cupType) {
        super(name, shape, size);
        this.cupType = cupType;
    }

    public String getCupType() {
        return cupType;
    }

    public void setCupType(String cupType) {
        this.cupType = cupType;
    }

    public String toString() {
        String tmp = "Cup: name=" + super.getName() + ", shape=" + super.getShape();
        tmp += ", size=" + super.getSize() + ", cup_type=" + this.getCupType();
        return tmp;
    }
}

class Plate extends Dish {
    private int deepth;

    public Plate(String name, String shape, int size, int deepth) {
        super(name, shape, size);
        this.deepth = deepth;
    }

    public int getDeepth() {
        return deepth;
    }

    public void setDeepth(int deepth) {
        this.deepth = deepth;
    }

    public String toString() {
        String tmp = "Plate: name=" + super.getName() + ", shape=" + super.getShape();
        tmp += ", size=" + super.getSize() + ", deepth=" + this.getDeepth();
        return tmp;
    }
}

public class TestDish {
    public static void main(String[] args) {
        // Cup test
        Cup objectCup = new Cup("Cup1", "round", 13, "golden");
        System.out.println(objectCup.toString());
        // Plate test
        Plate objectPlate = new Plate("Plate1", "square", 5, 2);
        System.out.println(objectPlate.toString());
    }
}
