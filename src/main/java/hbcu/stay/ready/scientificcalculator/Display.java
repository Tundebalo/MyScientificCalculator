package hbcu.stay.ready.scientificcalculator;

import java.awt.*;

public class Display {
    private String[] displayModeList = {"binary", "octal", "decimal", "hexadecimal"}; // An array of the display mode
    //private String[] radiansModeList =  {"Degrees", "Radians"}; // An array of the radians Mode list
    int i = 0;

    public String switchDisplayMode() {
        i++; // it will iterate through each display mode list
        if (i == 4) { // if the index is compared to 4
            i = 0; // then the index is at the first index
        }
        return displayModeList[i]; // it will return it at the index
    }


    public String[] switchRadians = {"Degrees", "Radians"};

    public String switchRadiansMode() {
        i++; // it will iterate through each display mode list
        if (i == 2) { // if the index is compared to 2
            i = 0; // then the index is at the first index
        }
        return switchRadians[i]; // it will return it at the index
    }



}





