package Archive.Uroki.Massivi;

import java.util.Arrays;

public class UrokKodMassiv2 {
    public static void main(String[] args) {
        int[]nums1=fillArray(8);
        System.out.println(Arrays.toString(nums1));
    }

    static int[] fillArray(int x){
        int[] nums = new int[x];
        for(int i=0; i<nums.length; i++){ /*Используем цикл for для присваивания значений элементам матрицы (инициализации) */
            nums[i]=i;}    // Присваиваем элементу с инд.i значение: i * 2
        return nums;
    }
}
//   Arrays.toString(num)


/*
    Cоздайте метод static int[] fillArray(int x), который принимает целое число и возвращает массив целых чисел,
    размером равный этому числу и заполненный числами от 0 до числа, меньшего на единицу, чем принятое.

        Пример ввода параметра: 3
        Пример возвращаемого массива: [0,1,2]

        Требования:
        1. Метод должен принимать целое число
        2. Метод не должен ничего выводить в консоль
        3. Метод должен возвращать массив целых чисел
*/
