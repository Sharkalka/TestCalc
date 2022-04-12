package com.company;

/* Класс проверки соответствия условия ввода данных в консоль для получения результата,
проверяет все возможные исключения и в случае несоответствия возвращает ложное значение.
 */

public class Validator {
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

    public static boolean isValid(String input) {
        String[] arguments = input.trim().split(" ");
        if (arguments.length != 3) {                            //Проверка на соотвествие формату 2 операнда и оператор
            return false;
        }
        switch (arguments[1]) {                                 // Проверка соответствия оператора разрешённому знаку
            case "+":
            case "-":
            case "*":
            case "/":
                break;
            default:
                return false;
        }
        return isRoman(arguments[0]) && isRoman(arguments[2]) || isArabic(arguments[0]) && isArabic(arguments[2]);
    } // Проверка соответствуют ли операнды только арабским или только римским числам

    public static boolean isRoman(String a) {  // Проверка, является ли число Римским
        for (int i = 0; i < 10; i++) {
            if (romanNumbersUpTo10[i].equals(a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArabic(String a) { // Проверка, является ли число Арабским, в принципе можно было оставить только одну проверку, но так понятнее
        try {
            int x = Integer.parseInt(a);
            return 0 < x && x <= 10;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
