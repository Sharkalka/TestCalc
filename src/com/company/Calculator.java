package com.company;

public class Calculator {
    private final int a;
    private final int b;
    private final String operator;
    private final boolean isArabic;

    public Calculator(int a, String operator, int b, boolean isArabic) {
        this.a = a;
        this.b = b;
        this.operator = operator;
        this.isArabic = isArabic;
    }

    /* В калькулятор в любом случае передаются числа в независимости от принадлежности Римским или арабским числа,
    но для вывода в нужном виде, калькулятор считывает boolean тип данных isArabic и в случае если числа не Арабские,
    преобразует результат в Римские числа.
     */
    public String getResult() throws Exception {
        int result = switch (operator) {
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> a + b;
        };
        if (!(isArabic)) {
            if( result <= 0) {
                throw new Exception("throws Exception");   // Если результат в Римских числах меньше 1, то выкидывает исключение
            }

            StringBuilder buf = new StringBuilder();

            final Numeral[] values = Numeral.values();
            for (int i = values.length - 1; i >= 0; i--) {
                while (result >= values[i].weight) {
                    buf.append(values[i]);
                    result -= values[i].weight;
                }
            }
            return buf.toString();
        } else {
            return String.valueOf(result);
        }
    }
}
