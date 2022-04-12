package com.company;

public class Equation {
    private final int a;
    private final int b;
    private final String operator;

    public Equation(String a, String operator, String b, boolean isArabic) {
        if (isArabic) {             // Сохраняет в себя Арабские или Римские числа в зависимости от переменной isArabic
            Arabic arabicA = new Arabic(a);
            Arabic arabicB = new Arabic(b);
            this.a = arabicA.getNumber();
            this.b = arabicB.getNumber();
        } else {
            Roman romanA = new Roman(a);
            Roman romanB = new Roman(b);
            this.a = romanA.getNumber();
            this.b = romanB.getNumber();
        }
        this.operator = operator;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOperator() {
        return operator;
    }
}
