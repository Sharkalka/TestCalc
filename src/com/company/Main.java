package com.company;

import not.needed.Argument;
import not.needed.StringToArguments;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int result;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            if (input.trim().split(" ").length < 3) {
                throw new Exception("throws Exception");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        Parser equation = new Parser(input);
        try {
            if (equation.isValid()) {
                if (Roman.isRoman(equation.getA()) && Roman.isRoman(equation.getB())) {
                    Roman romanA = new Roman(equation.getA());
                    Roman romanB = new Roman(equation.getB());
                    Calculate calculate = new Calculate(
                            romanA.getNumber(),
                            equation.getOperator(),
                            romanB.getNumber()
                    );
                    System.out.println(Roman.getResultInRoman(calculate.getResult()));
                } else if (Arabic.isArabic(equation.getA()) && Arabic.isArabic(equation.getB())) {
                    Arabic arabicA = new Arabic(equation.getA());
                    Arabic arabicB = new Arabic(equation.getB());
                    Calculate calculate = new Calculate(
                            arabicA.getNumber(),
                            equation.getOperator(),
                            arabicB.getNumber()
                    );
                    System.out.println((calculate.getResult()));
                } else {
                    throw new Exception("throws Exception");
                }
            } else {
                throw new Exception("throws Exception");
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
