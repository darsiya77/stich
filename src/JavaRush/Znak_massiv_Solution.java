package JavaRush;

public class Znak_massiv_Solution {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i ++) {
            array [i] = (array [i] % 2 == 0) ? - array [i] : array [i];
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}

 /*   Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
 если значение этого элемента чётное.

        Требования:
        •	Реализуй метод main(String[]) согласно условию.*/