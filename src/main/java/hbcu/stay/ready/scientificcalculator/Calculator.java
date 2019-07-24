package hbcu.stay.ready.scientificcalculator;

public class Calculator {
    Display display = new Display(); // Creates a new reference for Display
    protected double memory;

    public Calculator() {
        memory = 0; // Set the memory to 0 since the memory of a Calculator starts with a 0
    }

    public Calculator(double memory) {
        this.memory = memory;
    }

    public double add(double x) {
        memory += x; // the memory will be added to your input, which is x
        return memory; // you will return the memory of the added number
    }

    public double add(double x, double y) {
        return 0;
    }

    public double subtract(double x) {
        memory -= x; // the memory will be subtracted by your input, which is x
        return memory;
    }

    public double multiply(double x) {
        memory *= x; // the memory will be multiplied by your input, which is x
        return memory;
    }

    public double divide(double x) throws ArithmeticException {
        if(x == 0) throw new ArithmeticException(); // if you try to divide a number by x, it will throw an Exception
        memory /= x; // the memory will be divided by your input, which is is x
        return memory;
    }

    public double square() {
        memory = Math.pow(memory, 2); // the number in your memory will be squared to your input, which is 2
        return memory;
    }

    public double squareRoot(double x) {
        memory = Math.sqrt(x); // the number in your memory will be square rooted
        return memory;
    }

    public double exponentiation(double x) {
        memory = Math.pow(memory, x); // the memory will be added to your input, which is is x
        return x;
    }

    public double inverse() {
         memory = 1 / memory; // the number in the memory will be inverse of itself.
        return memory;
    }

    public double invert() {
        if(memory > 0) { // the number in your memory will be inverted to its opposite, so if it is a negative
            return -memory; // number, then it will return as a positive.
        }
        return memory; // if it is not a negative number, it will return as a positive
    }


}

