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
    private int number;

    public Roman(String a) {
        for (int i = 0; i < 10; i++) {
            if (romanNumbersUpTo10[i].equals(a)) {    // Передаёт в класс Roman значение Римского числа в арабском виде
                number = i + 1;
            }
        }
    }

    public int getNumber() {
        return number;
    }
}
