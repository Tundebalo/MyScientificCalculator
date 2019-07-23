package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {

    @Test
    public void switchDisplayModeTest() {
        Display display = new Display();

        String displayMode = display.switchDisplayMode();
        String expected = "octal";
        String actual = displayMode;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchRadiansTest() {
        Display display = new Display();

        String radiansMode = display.switchRadiansMode();
        String expected = "Degrees";
        String actual = "Degrees";

        Assert.assertEquals(expected, actual);
    }
}