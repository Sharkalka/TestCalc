package com.company;

public class Calculate {
    private final int a;
    private final int b;
    private final String operator;

    public Calculate(int a, String operator, int b) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public int getResult() {
        switch (operator) {
           case "-":
               return a - b;
           case "*":
               return a * b;
           case "/":
               return a / b;
            default:
                return a + b;
        }
    }
}
