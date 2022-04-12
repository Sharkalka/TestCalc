package com.company;

public class Parser {
    public final Equation equation;
    private final boolean isArabic;

    /* При создании класса Parser происходит проверка данных на соответствие условиям ввода,
    иначе выдаёт исключение. Создаёт внутри класс уравнение, доступный всей программе для доступа.
     */
    public Parser(String input) throws Exception {
        if (Validator.isValid(input)) {
            String[] arguments = input.trim().split(" ");
            this.isArabic = Validator.isArabic(arguments[0]);
            equation = new Equation(arguments[0], arguments[1], arguments[2], this.isArabic);
        } else {
            throw new Exception("throws Exception");
        }
    }

    public boolean isArabic() {
        return isArabic;
    }

    public Equation getEquation() {
        return equation;
    }
}
