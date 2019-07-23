package hbcu.stay.ready.scientificcalculator;

import java.awt.*;

public class Display {
    private String[] displayModeList = {"binary", "octal", "decimal", "hexadecimal"};
    private String[] radiansModeList =  {"Degrees", "Radians"};
    int i = 0;

    public String switchDisplayMode() {
        i++;
        if (i == 4) {
            i = 0;
        }
        return displayModeList[i];
    }


    public String[] switchRadians = {"Degrees", "Radians"};

    public String switchRadiansMode() {
        i++;
        if (i == 2) {
            i = 0;
        }
        return switchRadians[i];
    }



}





