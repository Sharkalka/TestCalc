package com.company;

public class Roman {
    private static final String[] romanNumbersUpTo10 = new String[] {
            "I",
            "II",
            "III",
            "IV",
            "V",
            "VI",
            "VII",
            "VIII",
            "IX",
            "X"
    };
    private boolean isRoman;
    private int number;
    public Roman(String a) {
        for (int i = 0; i < 10; i++) {
            if (romanNumbersUpTo10[i].equals(a)) {
                number = i + 1;
            }
        }
        this.isRoman = true;
    }

    public static boolean isRoman(String a) {
        for (int i = 0; i < 10; i++) {
            if (romanNumbersUpTo10[i].equals(a)) {
                return true;
            }
        }
        return false;
    }

    public int getNumber() {
        return number;
    }

    public static String getResultInRoman(int n) throws Exception {

        if( n <= 0) {
            throw new Exception("throws Exception");
        }

        StringBuilder buf = new StringBuilder();

        final Numeral[] values = Numeral.values();
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i].weight) {
                buf.append(values[i]);
                n -= values[i].weight;
            }
        }
        return buf.toString();
    }
}
