package com.company;

public class Parser {
    private String input;
    private String a;
    private String b;
    private String operator;
    private String[] arguments;

    public Parser(String input) throws Exception {
        this.input = input;
        this.arguments = input.trim().split(" ");
        this.a = arguments[0];
        this.b = arguments[2];
        this.operator = arguments[1];
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isValid() {
        if (arguments.length != 3) {
            System.out.println("Format" + arguments.length);
            return false;
        }
        switch (operator) {
            case "+":
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
            default:
                System.out.println("Operator unavailable");
                return false;
        }
        return Roman.isRoman(a) && Roman.isRoman(b) || Arabic.isArabic(a) && Arabic.isArabic(b);
    }
}
