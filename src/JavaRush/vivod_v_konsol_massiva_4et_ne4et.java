package JavaRush;

import java.util.Scanner;

public class vivod_v_konsol_massiva_4et_ne4et {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int N = inn.nextInt();
        int[] arr;
        if (N > 0) {
            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = inn.nextInt();
            }

            if (N % 2 == 0) {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            } else
                for (int a : arr) {
                    System.out.println(a);
                }
        }
    }
}
    /*Тебе нужно написать программу, которая:

        Считывает с консоли целое число N.
        Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
        Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
        Каждое число выводить с новой строки. Число N выводить не нужно.
        Требования:
        •	Программа должна считывать число N и за ним еще N чисел.
        •	В классе должен быть метод public static void main(String[]).
        •	Нельзя добавлять новые методы в класс Solution.
        •	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
        •	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.*/