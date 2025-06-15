package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;

public class Sliyanie_2_Massivov_CopyOf {

    public static void main(String[] args) {
        int[] a3 = mergeAndSort(new int[]{7, 2, 5, 1, 14}, new int[]{23, 22, 14, 0});
        System.out.print(Arrays.toString(a3));
        System.out.println();
        int a =1;
        ++a;
        int b = 1;
        int c = a + b;
        System.out.println(c);

    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, thirdArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, thirdArray, firstArray.length, secondArray.length);
        Arrays.sort(thirdArray);
        return thirdArray;
    }
}
