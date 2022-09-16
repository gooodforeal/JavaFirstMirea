package ru.mirea.task30;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void getSum() {
        int expected = 29;
        Calculator calc = new Calculator();
        int actual = calc.getSum(14, 15);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDif() {
        int expected = 25;
        Calculator calc = new Calculator();
        int actual = calc.getDif(50, 25);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMult() {
        int expected = 100;
        Calculator calc = new Calculator();
        int actual = calc.getMult(10, 10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDiv() {
        double expected = 4;
        Calculator calc = new Calculator();
        double actual = calc.getDiv(20, 5);
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void getSquare() {
        int expected = 25;
        Calculator calc = new Calculator();
        int actual = calc.getSquare(5);
        Assert.assertEquals(expected, actual);
    }
}