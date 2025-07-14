package Archive.File.ZadachiKata.SumOfDouble2;

import java.io.*;

import java.nio.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        try (scan) {
            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    sum += Double.parseDouble(scan.next());
                } else {
                    scan.next();
                }
            }
            System.out.printf("%.6f", sum);
        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }

    }
}
/*

    Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте
    вещественных чисел с точностью до шестого знака после запятой. Числом считается последовательность символов,
    отделенная от окружающего текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.

        На этот раз вам надо написать программу полностью, т.е. объявить публичный класс с именем Main
        и точку входа в программу — метод main. И добавить все необходимые импорты

        Пример ввода 1: 1 2 3
        Пример вывода 1: 6.000000

        Пример ввода 2: a1 b2 c3
        Пример вывода 2: 0.000000

        Пример ввода 3: -1e3 18 .111 11bbb
        Пример вывода 3: -981.889000
*/
