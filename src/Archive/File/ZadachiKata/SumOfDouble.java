package Archive.File.ZadachiKata;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.util.*;

// Описание решения: Цикл вайл (пока есть что читать с консоли scan.hasNext()) {(если то что следующее дабл
// scan.hasNextDouble() то ) {sum += дабл Double.parseDouble(scan.next()) } если нет {сканируй дальше scan.next() } }.
// Затем выведи на печать System.out.printf("%.6f", sum)

/*      IDEA, после ввода с клавиатуры, жмем Enter и ОБЯЗАТЕЛЬНО - Ctrl D.
        Тем самым даем понять, что ввод закончен!!! Иначе, при окончании цикла,
        сразу последует выход без распечатки итоговой суммы.*/

public class SumOfDouble {
    public static void main(String[] args) {
        double sum = 0;
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    sum += Double.parseDouble(scan.next());
                } else {
                    scan.next();
                }
            }

            System.out.printf("%.6f", sum);
        } catch (Exception e) {
            System.out.printf("%.6f", 0);
        }
    }
}
    /*
    Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте
    вещественных чисел с точностью до шестого знака после запятой.

    Числом считается последовательность символов, отделенная от окружающего текста пробелами или переводами строк
    и успешно разбираемая методом Double.parseDouble.

    На этот раз вам надо написать программу полностью, т.е. объявить публичный класс с именем Main и точку входа
    в программу — метод main. И добавить все необходимые импорты
    Пример ввода 1: 1 2 3

Пример вывода 1: 6.000000



Пример ввода 2: a1 b2 c3

Пример вывода 2: 0.000000



Пример ввода 3: -1e3 18 .111 11bbb

Пример вывода 3: -981.889000
    */