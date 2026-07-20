package org.spring.coding_bat;

public class Warmup_1 {

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }


    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            if (a < 0 && b < 0) {
                return true;
            }
        } else {
            if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
                return true;

            }
        }
        return false;

    }


    public static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }


    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}
