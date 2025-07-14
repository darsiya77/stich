package Archive.arabian;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Converter converter = new Converter();

        String[] actions = {"+", "-", "/", "*"};
        String[] regexAction = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in); // System.in - Стандартная команда, что бы задать поток входных данных
        System.out.println("Введите выражение: ");
        String exp = scn.nextLine(); // Ссылаем 'exp' на то, что будет получено с клавиатуры методом 'nextLine()'

        // Определяем арифметическое действие:

        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
        // Если не нашли арифметическое действие, завершаем программу:

        if (actionIndex == -1) {
            System.out.println("Некорректное выражение");
            return; // return - завершает работу метода 'main'
        }
        //Делим строчку по найденному арифметическому знаку. (2+4.split(+) -> {"2", "4"})

        String[] data = exp.split(regexAction[actionIndex]);

        //Определяем, находятся ли числа в одном формате (оба римские или оба арабские)

        if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {
            int a, b;
            // Определяем римские ли это числа
            boolean isRoman = converter.isRoman(data[0]);
            if (isRoman) {
                a = converter.romanToInt(data[0]);
                b = converter.romanToInt(data[1]);
                if (a > 10 || b > 10) {
                    System.out.println("Некорректное выражение");
                    return;
                }
            } else {
                // если арабские, конвертируем их из строки в число
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);
                if (a > 10 || b > 10) {
                    System.out.println("Некорректное выражение");
                    return;
                }
            }
            //выполняем с числами арифметическое действие
            int result = 0;
            switch (actions[actionIndex]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "/":
                    result = a / b;
                    break;
                case "*":
                    result = a * b;
                    break;
            }
            if (isRoman) {
                // если числа были римские, возвращаем результат в римском числе
                System.out.println(converter.intToRoman(result));
            } else {
                //если числа были арабские, возвращаем результат в арабском числе
                System.out.println(result);
            }
        } else {
            System.out.println("Числа должны быть в одном формате");
        }

    }
}