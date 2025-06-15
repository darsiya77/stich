package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;
/*Цель: Вернуть середину массива
        Что нужно знать:
        1. Массивы
        2. Условные операторы
        3. Циклы
        Задание:
        Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины,
        то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.
        Пример ввода: {1, 5, 2, 17}
        Пример вывода: [5, 2]
        Пример ввода: {14, 16, 3}
        Пример вывода: [16]
        Пример ввода: {}
        Пример вывода: []
        Требования:

        Метод должен быть public static
Сигнатура метода getArrayMiddle(int[] numbers)
        Не использовать Arrays, System.arrayCopy*/ // Условия Задачи
import java.util.Arrays;

public class SeredinaMassiva {
    public static void main(String[] args) {
        int[] m = getArrayMiddle(new int[]{3,4,1});
        System.out.println(Arrays.toString(m));
    }
    public static int[] getArrayMiddle(int[] numbers) {
        int[] a;
        int[] b = {};
        if (numbers.length ==0)
            return b;
        else
        if (numbers.length % 2 == 0) {

            a = new int[2];
            a[0] = numbers[(numbers.length / 2) - 1];
            a[1] = numbers[numbers.length / 2];
        } else {
            a = new int[1];
            a[0] = numbers[numbers.length / 2];
        }
        return a;
    }
}
