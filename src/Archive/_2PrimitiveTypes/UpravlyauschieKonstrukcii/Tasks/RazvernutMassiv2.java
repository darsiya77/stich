package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;

public class RazvernutMassiv2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray2(new int[]{1,2,3,4,5,6})));
    } //public static int[] inverseArray(int[] numbers) {
    public static int [] reverseArray2(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    return arr;
    }
}
