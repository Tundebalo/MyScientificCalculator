package hbcu.stay.ready.scientificcalculator;

public class ScientificFeatures extends  Calculator{

    public ScientificFeatures() {
        memory = 0;
    }

    public ScientificFeatures(double memory) {
        this.memory = memory;
    }

    public double sine(double x) {
        return Math.sin(x); // it will return the sine of the digit at the memory
    }

    public double cosine(double x) {
        return Math.cos(x); // it will return the cosine of the digit at the memory
    }

    public double tangent(double x) {
        return (Math.tan(x)); // it will return the tangent of the digit at the memory
    }

    public double inverseSine(double x) {
        return (Math.asin(x)); // it will return the inverse Sine of the digit at the memory
    }

    public double inverseCosine(double x) {
        return (Math.acos(x)); // it will return the inverse Cosine of the digit at the memory
    }

    public double inverseTangent(double x) {
        return (Math.atan(x)); // it will return the inverse Tangent of the digit at the memory
    }

    public double logarithm(double x) {
        return (Math.log(x)); // it will return the logarithm of the digit at the memory
    }

    public double inverseLogarithm(double x) {
        return (Math.log10(x)); // it will return the inverse Logarithm of the digit at the memory
    }


    public double naturalLogarithm(double x) {
        return (Math.log(x) / Math.log(2.78128)); // it will return the natural logarithm of the digit at the memory
    }

    public double inverseNaturalLogarithm(double x) {
        return (Math.exp(x)); // it will return the inverse of the natural logarithm of the digit at the memory
    }

    public double factorial(double x) {
        double result = 1; // the beginning number will be 1

        for(double factor = 2; factor <= x; factor++) {
            result *= factor;
        }
        return result;
    }

    public double resetMemory() {
        memory = 0.0;
        return memory; // this will reset the memory back to 0
    }

    public double addMemory(double x) {
        memory += x;
        return memory; // this will add your input to the memory and return it back into the memory
    }

    public double returnMemory(double x) {
        return memory; // this will simply return the memory
    }
}
