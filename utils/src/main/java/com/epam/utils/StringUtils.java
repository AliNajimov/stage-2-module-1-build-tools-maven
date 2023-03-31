package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(str == null){
            return false;
        }
        double v = Double.parseDouble(str);
        return v>0;
    }
}
