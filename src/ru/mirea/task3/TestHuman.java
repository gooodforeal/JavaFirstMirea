package ru.mirea.task3;


class Head {
    private String eyeColor;
    private int hairLength;

    Head(String argEyeColor, int argHairLength) {
        eyeColor = argEyeColor;
        hairLength = argHairLength;
    }

    public int getHairLength() {
        return hairLength;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }
}

class Arm {
    private int length;
    private int width;

    Arm(int argLength, int argWidth) {
        length = argLength;
        width = argWidth;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class Body {
    private int waistLength;
    private int breastLength;

    Body(int argWaistLength, int argBreastLength) {
        waistLength = argWaistLength;
        breastLength = argBreastLength;
    }

    public int getBreastLength() {
        return breastLength;
    }

    public int getWaistLength() {
        return waistLength;
    }

    public void setBreastLength(int breastLength) {
        this.breastLength = breastLength;
    }

    public void setWaistLength(int waistLength) {
        this.waistLength = waistLength;
    }
}

class Leg {
    private int size;

    Leg(int argSize) {
        size = argSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Human {
    private int height;
    private int weight;
    private Head head;
    private Body body;
    private Arm leftArm, rightArm;
    private Leg leftLeg, rightLeg;

    Human(Head argHead, Body argBody, Arm argLeftArm,
          Arm argRightArm, Leg argLeftLeg, Leg argRightLeg, int argHeight, int argWeight) {
        head = argHead;
        body = argBody;
        leftArm = argLeftArm;
        rightArm = argRightArm;
        leftLeg = argLeftLeg;
        rightLeg = argRightLeg;
        height = argHeight;
        weight = argWeight;
    }

    public Arm getLeftArm() {
        return leftArm;
    }

    public Arm getRightArm() {
        return rightArm;
    }

    public Body getBody() {
        return body;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeftArm(Arm leftArm) {
        this.leftArm = leftArm;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightArm(Arm rightArm) {
        this.rightArm = rightArm;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        String tmp = "Human: height=" + height + ", weight=" + weight + "\n";
        tmp += "Head: eyes=" + this.getHead().getEyeColor() + ", hair=" + this.getHead().getHairLength() + "\n";
        tmp += "Body: waist=" + this.getBody().getWaistLength() + ", breast=" + this.getBody().getBreastLength() + "\n";
        tmp += "Arms: length=" + this.getLeftArm().getLength() + ", width=" + this.getLeftArm().getWidth() + "\n";
        tmp += "Legs: size=" + this.getLeftLeg().getSize();
        return tmp;
    }
}

public class TestHuman {
    public static void main(String[] args) {
        Head objectHead = new Head("blue", 2);
        Body objectBody = new Body(44, 90);
        Arm objectLeftArm = new Arm(70, 30);
        Arm objectRightArm = new Arm(70, 30);
        Leg objectLeftLeg = new Leg(39);
        Leg objectRightLeg = new Leg(39);
        Human objectHuman = new Human(objectHead, objectBody, objectLeftArm, objectRightArm,
                objectLeftLeg, objectRightLeg, 193, 100);
        System.out.println(objectHuman.toString());
    }
}