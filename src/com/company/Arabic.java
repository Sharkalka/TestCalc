package com.company;

public class Arabic {
    private boolean isArabic;
    private int number;

    public Arabic(String a) {
        this.number = Integer.parseInt(a);
        this.isArabic = true;
    }

    public static boolean isArabic(String a) {
        try {
            int x = Integer.parseInt(a);
            if (0 < x && x <= 10) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public int getNumber() {
        return number;
    }
}
