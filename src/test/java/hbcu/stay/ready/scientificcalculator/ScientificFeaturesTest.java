package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class ScientificFeaturesTest {

    @Test
    public void sineTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.sine(7.0);
        double expected = 0.65698659871;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void cosineTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.cosine(7.0);
        double expected = 0.75390225434;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void tangentTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.tangent(7.0);
        double expected = 0.87144798272;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void inverseSineTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.inverseSine(0.5);
        double expected = 0.52359877559829;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void inverseCosineTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.inverseCosine(1);
        double expected = 0;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseTangentTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.inverseTangent(5);
        double expected = 1.37340077;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void logarithmTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.logarithm(60984.1);
        double expected = 11.018368453441132;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void inverseLogarithmTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.inverseLogarithm(5);
        double expected = 0.69897000433;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void naturalLogarithmTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.naturalLogarithm(7.0);
        double expected = 1.94591014906;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void inverseNaturalLogarithmTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.inverseNaturalLogarithm(7.0);
        double expected = 1096.633158;

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void factorialTest() {
        ScientificFeatures science = new ScientificFeatures();
        double actual = science.factorial(7.0);
        double expected = 5040;

        Assert.assertEquals(expected, actual, 0.1);
    }
}
