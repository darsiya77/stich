package Archive.FunctionalProgramming.Predicate.HomeWork;

import java.util.function.IntPredicate;

public class MainHW5 {
    public static void main(String[] args) {
        IntPredicate intPr1 = n -> {
            String str = String.valueOf(Math.abs(n));
            char[] ch = str.toCharArray();
            int sum = 0;
            for (char c : ch) {
                sum += c - '0';   // или использовать метод - Character.getNumericValue()
            }
            return sum % 2 == 0;
        };
        IntPredicate intPr2 = num -> {
            int result = 0;
            num = Math.abs(num);
            while (num != 0) {
                result += num % 10;
                num /= 10;
            }
            return result % 2 == 0;
        };
//        - num % 10 извлекает последнюю цифру числа.
//        - num /= 10 убирает последнюю цифру (сдвигает число вправо). Например, 103 ? 10 ? 1 ? 0

        System.out.println(intPr1.test(-103));
        System.out.println(intPr2.test(-103));
        System.out.println('9' - '0');
    }

}

/*
    Создайте такую реализацию IntPredicate которая будет возвращать true в случае когда сумма
        цифр числа число четное. Например для 103 — вернет true, так 1+0+3 = 4.*/
