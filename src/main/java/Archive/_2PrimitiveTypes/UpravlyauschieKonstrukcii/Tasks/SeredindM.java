package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;

public class SeredindM {
    public static int[] getArrayMiddle(int[] numbers) {
        int m;
        int[] middle;
        int[] middlenull = {};
        if (numbers.length == 0) {
            return middlenull;
        } else {
            m = (numbers.length % 2 == 0) ? 2 : 1;
            middle = new int[m];
            switch (m) {
                case 1 -> {
                    middle[0] = numbers[numbers.length / 2];
                }
                case 2 -> {
                    middle[0] = numbers[numbers.length / 2 - 1];
                    middle[1] = numbers[numbers.length / 2];
                }
            }
            return middle;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2};
        System.out.println(Arrays.toString(getArrayMiddle(array)));
    }
}
