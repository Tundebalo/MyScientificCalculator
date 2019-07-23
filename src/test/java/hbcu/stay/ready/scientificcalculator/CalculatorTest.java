package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator(10);
        double actual = calculator.multiply(2);
        double expected = 20;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divideTest() {
        Calculator calculator = new Calculator(10);
        calculator.divide(0);
    }

    @Test
    public void squareTest() {
        Calculator calculator = new Calculator(5);
        double actual = calculator.square();
        double expected = 25;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void squareRootTest() {
        Calculator calculator = new Calculator(100);
        double actual = calculator.squareRoot(100);
        double expected = 10;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void exponentiationTest() {
        Calculator calculator = new Calculator(10);
        double actual = calculator.exponentiation(1000);
        double expected = 1000;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void inverseTest() {
        Calculator calculator = new Calculator(5);
        double actual = calculator.inverse();
        double expected = 0.2;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void invertTest() {
        Calculator calculator = new Calculator(10);
        double actual = calculator.invert();
        double expected = -10;

        Assert.assertEquals(expected, actual, 0);
    }
}
