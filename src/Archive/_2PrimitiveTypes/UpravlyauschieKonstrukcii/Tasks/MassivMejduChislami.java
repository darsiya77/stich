package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;

/*Дан массив возрастающих чисел. Даны два числа. Задача - написать метод, который из данного массива достанет ту часть,
которая лежит между данными числами (включительно).
        Что нужно знать:
        1. Работта с массивами
        2. Циклы
        3. Условные операторы
        Пример ввода: {1,3,5,6,9,11,24}, 4, 10
        Пример вывода: [5, 6, 9]
        Требования:
        метод должен быть public static
сигнатура метода getSubArrayBetween(int[] numbers, int start, int end*/ // Условия задачи
public class MassivMejduChislami {
    public static void main(String[] args) {

        int[] massiv = getSubArrayBetween((new int[]{1, 3, 5, 6, 7, 9, 11, 24}), 4, 10);
        System.out.println(Arrays.toString(massiv));

    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] > start || numbers[i] == start) && (numbers[i] < end || numbers[i] == end)) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if ((numbers[i] > start || numbers[i] == start) && (numbers[i] < end || numbers[i] == end)) {
                result[j] = numbers[i];
                j++;
            }
        }
        return result;
    }
}
