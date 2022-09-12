package ru.mirea.task17;
import java.lang.Enum;

enum Planet {
    MARS(3389, 6.639 * Math.pow(10, 24)),
    EARTH(6371, 5.972 * Math.pow(10, 24)),
    JUPITER(69911, 1.898 * Math.pow(10, 27)),
    MERCURY(2439, 3.285 * Math.pow(10, 23)),
    VENUS(6051, 4.867 * Math.pow(10, 24)),
    SATURN(58232, 5.683 * Math.pow(10, 26)),
    URANUS(25362, 8.681 * Math.pow(10, 25)),
    NEPTUNE(24622, 1.024 * Math.pow(10, 26));
    private double radius;
    private double weight;
    Planet(double r, double w) {
        radius = r;
        weight = w;
    }
    public double getG() {
        return (6.67 * Math.pow(10, - 11)) * weight / (radius * radius);
    }
}
