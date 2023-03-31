package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(str.isEmpty()){
            return false;
        }
        double v = Double.parseDouble(str);
        return v>0;
    }
}
