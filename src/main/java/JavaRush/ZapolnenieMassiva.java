package JavaRush;

import java.util.Arrays;

public class ZapolnenieMassiva {
    public static int[] array = new int[21];
    public static int valueStart = 1;
    public static int valueEnd = 10;

    public static void main(String[] args) {
            if (array.length % 2 == 0){
                Arrays.fill(array,0, array.length/2,valueStart);
                Arrays.fill(array,array.length/2, array.length,valueEnd);
        } else {
                Arrays.fill(array,0, (array.length/2) + 1,valueStart);
                Arrays.fill(array,(array.length/2) + 1, array.length,valueEnd);
            }
                System.out.println(Arrays.toString(array));
            for (int j = 0; j < array.length; j ++){
                array[j] = j;
            }
        System.out.println(Arrays.toString(array));
    }
}
/*
    Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
        Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
        Если длина массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd. Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
        При тестировании значения полей класса Solution будут разными, учти это.

        Требования:
        •	Реализуй метод main(String[]) согласно условию.*/
