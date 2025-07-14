package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;

public class Sliyanie_2_Massivov_While {
    public static void main(String[] args) {
        int[] a3 = mergeAndSort(new int[]{7, 2, 5, 1, 14}, new int[]{23, 22, 14, 0});
        System.out.print(Arrays.toString(a3));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        int i1 = 0, i2 = 0, i3 = 0;
        for (; i3 < thirdArray.length; i3++, i1++) {
            thirdArray[i3] = (i1 < firstArray.length) ? firstArray[i1] : secondArray[i2];
            if (i3 > firstArray.length - 1) {
                i2++;
            }
        }
        int cash;
        boolean statusSort = false;

        while (!statusSort) {
            statusSort = true;

            for (i3 = 0; i3 < thirdArray.length - 1; i3++) {

                if (thirdArray[i3] > thirdArray[i3 + 1]) {
                    statusSort = false;
                    cash = thirdArray[i3];
                    thirdArray[i3] = thirdArray[i3 + 1];
                    thirdArray[i3 + 1] = cash;
                }
            }
        }
        return thirdArray;
    }

}
    /*=================================================================================================================
    Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же
    порядке массив. Массивы могут быть любой длины, в том числе нулевой.
    Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным
    массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при
    помощи Arrays.sort() уже не требовалась. К сожалению, автоматически это не проверить, так что это остается на вашей
    совести:
    Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая
    система.

    Пример ввода: {0, 2, 2} и {1, 3}
    Пример вывода: {0, 1, 2, 2, 3}

    Требования:
    Cигнатура метода должна быть: mergeArrays(int[] a1, int[] a2)
    ==================================================================================================================*/

