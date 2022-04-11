package com.company;

public class Roman {
    private String[] romanNumbersInput = new String[] {
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

    public Roman(int a) {
        for (int i = 0; i < 10; i++) {
            if (romanNumbersInput[i].equals(a)) {
                this.isRoman = true;
            } else {
                this.isRoman = false;
            }
        }
    }

    public boolean isRoman() {
        return isRoman;
    }

    public int getArabicFromRoman(String a) {
        int arabicNumber;
        for (int i = 0; i < 10; i++) {
            if (romanNumbersInput[i].equals(a)) {
                arabicNumber = i + 1;
            }
        }
        return arabicNumber;
    }

    public String getResultInRoman(int a) {
        String roman = new String("");
        try {
            if (a < 1) {
                throw new Exception("throws Exception");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
