package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;

public class Seredina_massiva_2 {
    public static void main(String[] args) {
        int[] m = getArrayMiddle(new int[]{3, 4, 1});
        System.out.println(Arrays.toString(m));
        //System.out.println(0%2);
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int[] theMiddle;
        int[] arrayNull = {};
        if (numbers.length == 0) {
            return arrayNull;
        } else {
            if (numbers.length % 2 == 0) {

                theMiddle = new int[2];
                theMiddle[0] = numbers[(numbers.length / 2) - 1];
                theMiddle[1] = numbers[numbers.length / 2];
            } else {
                theMiddle = new int[1];
                theMiddle[0] = numbers[numbers.length / 2];
            }
        }
        return Arrays.copyOf(theMiddle, theMiddle.length);// copyOf - переписывает в новый массив исходник
    }
}
