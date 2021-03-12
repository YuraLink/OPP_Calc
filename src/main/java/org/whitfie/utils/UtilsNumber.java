package org.whitfie.utils;

public class UtilsNumber {
    public static float tryGetFloat(String s) {
        try {
            return Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
