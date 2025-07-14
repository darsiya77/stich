package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;

public class Sliyanie_2Massivov_Sortirovka {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortirovkaSlitaya(new int[]{7,2,5,1,14},new int[]{23,22,11,0})));
    }
    public static int[] SortirovkaSlitaya(int[] arr1, int[] arr2){
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = l1 + l2;
        int [] arr3 = new int[l3];
        int a1 = 0; int a2 = 0; int a3 = 0;
        while (a1 < l1){
                arr3[a3] = arr1[a1];
                a1++; a3++;
        }
        while (a2 <l2){
            arr3[a3] = arr2[a2];
            a2++;a3++;
        }
//        Сообщение от ментора
//        первый и второй while делают одно и тоже, подумай как можно улучшить
        int cash;
        boolean statusSort = false;

        while (!statusSort) {
            statusSort = true;

            for (int s3 = 0; s3 < l3 - 1; s3++) {

                if (arr3[s3] > arr3[s3 + 1]) {
                    statusSort = false;
                    cash = arr3[s3];
                    arr3[s3] = arr3[s3 + 1];
                    arr3[s3 + 1] = cash;
                }
            }
        }
        return arr3;
    }
}
