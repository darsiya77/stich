package JavaRush;

import java.util.Scanner;

public class Minimum_v_massive {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner inn = new Scanner(System.in);
        int N = inn.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = inn.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < N; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
/*
    1. Ввести с клавиатуры число N.
    2. Считать N целых чисел и заполнить ими массив.
    3. Найти минимальное число среди элементов массива и вывести в консоль.
        Требования:
        •	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array
        размером N элементов и заполни числами с клавиатуры.
        •	В методе main(String[]) выведи в консоль минимальное число среди элементов массива.*/
