package hbcu.stay.ready.scientificcalculator;

public class Calculator {
    Display display = new Display();
    private double memory;

    public Calculator() {
        memory = 0;
    }

    public Calculator(double memory) {
        this.memory = memory;
    }

    public double add(double x) {
        memory += x;
        return memory;
    }

    public double add(double x, double y) {
        return 0;
    }

    public double subtract(double x) {
        memory -= x;
        return memory;
    }

    public double multiply(double x) {
        memory *= x;
        return memory;
    }

    public double divide(double x) {
        memory /= x;
        try {
            display.setCurrentNumber(memory / x);
        } catch (Exception e) {
            System.out.println("Error");
        }
        return memory;
    }

    public double square() {
        memory = Math.pow(memory, 2);
        return memory;
    }

    public double squareRoot(double x) {
        memory = Math.sqrt(x);
        return memory;
    }

    public double exponentiation(double x) {
        memory = Math.pow(memory, x);
        return x;
    }

    public double inverse() {
         memory = 1 / memory;
        return memory;
    }

    public double invert() {
        if(memory > 0) {
            return -memory;
        }
        return memory;
    }
}

