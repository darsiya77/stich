package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;
/*ель: Развернуть данный массив
        Что нужно знать:
        1. Работа с массивами
        2. Циклы
        Задание: Напистаь метод, который принимает массив, разворачивает его и возвращает.
        Пример ввода: {1, 4, 6, 7}
        Пример вывода: [7, 6, 4, 1]
        Пример ввода: {}
        Пример вывода: []
        Требования:
        метод должен быть public static
        сигнатура метода inverseArray(int[] numbers)*/ // Условия Задачи

import Archive.Uroki.Massivi.Array;

import java.util.Arrays;

public class RazvernutMassiv {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inverseArray(new int[]{1, 2, 3, 4})));
        System.out.println("____________________________");
        // System.out.println(Arrays.toString(inverseArray(new int[]{1,2,3,4})));
        //System.out.println(Arrays.toString(inverseArray(m)));
        //System.out.println(m.length);
    }

    public static int[] inverseArray(int[] numbers) {
        int[] arrayNull = {};
        int[] result = new int[numbers.length];
        if (numbers.length == 0) {
            return arrayNull;
        }
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = numbers[i];
        }
        return result;
    }
}
