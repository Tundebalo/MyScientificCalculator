package hbcu.stay.ready.scientificcalculator;

public class ScientificFeatures {
    Display display = new Display();
    private double memory;

    public ScientificFeatures() {
        memory = 0;
    }

    public ScientificFeatures(double memory) {
        this.memory = memory;
    }

    public double sine(double x) {
        return Math.sin(x);
    }

    public double cosine(double x) {
        return Math.sin(x);
    }

    public double tangent(double x) {
        return (Math.tan(x));
    }

    public double inverseSine(double x) {
        return (Math.asin(x));
    }

    public double inverseCosine(double x) {
        return (Math.acos(x));
    }

    public double inverseTangent(double x) {
        return (Math.atan(x));    }

    public double logarithm(double x) {
        return (Math.log(x));
    }

    public double inverseLogarithm(double x) {
        return (Math.log10(x));
    }


    public double naturalLogarithm(double x) {
        return (Math.log(x) / Math.log(2.78128));
    }

    public double inverseNaturalLogarithm(double x) {
        return (Math.exp(x));
    }

    public double factorial(double x) {
        double result = 1;

        for(double factor = 2; factor <= x; factor++) {
            result *= factor;
        }
        return result;
    }

    public double resetMemory() {
        memory = 0.0;
        return memory;
    }

    public double addMemory(double x) {
        memory += x;
        return memory;
    }

    public double returnMemory(double x) {
        return memory;
    }
}
