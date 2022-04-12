package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();                    //Консольный ввод данных

        Parser parsedEquation = new Parser(input);            //Преообразование введённой строки в уравнение
        Calculator calculator = new Calculator(               //Калькулятор данных
                parsedEquation.getEquation().getA(),
                parsedEquation.getEquation().getOperator(),
                parsedEquation.getEquation().getB(),
                parsedEquation.isArabic()
        );
        System.out.println(calculator.getResult());           //Вывод результата в консоль
    }
}
