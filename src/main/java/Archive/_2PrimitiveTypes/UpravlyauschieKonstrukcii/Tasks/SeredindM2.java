package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;

public class SeredindM2 {
    public static int[] getArrayMiddle(int[] numbers) {
        int theMiddleLenght = (numbers.length % 2 == 0) ? 2 : 1;
        int[] middle = new int[theMiddleLenght];
        int[] arrayNull= {};
        if (numbers.length == 0) {
            return arrayNull;
        } else {
            if (numbers.length % 2 != 0) {
                Arrays.fill(middle, numbers[numbers.length / 2]);
            } else {
                middle = Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
            }
            return middle;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{11, 2, 5, 9};
        System.out.println(Arrays.toString(getArrayMiddle(array)));
    }
}
