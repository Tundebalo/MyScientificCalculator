package hbcu.stay.ready.scientificcalculator;

import java.awt.*;

public class Display {
    private double currentNumber = 0.0;

    public double getCurrentNumber() {
        return currentNumber;
    }
    public void setCurrentNumber(double number) {
        currentNumber = number;
    }
    public void clear() {
        currentNumber = 0;
    }


}





