package Archive._2PrimitiveTypes.MassiviStroki.Teoriya;

public class PereborMassiva {
    public static void main(String[] args) {
        int[]num = {1,3,5,10};
        int total = 0;
        for (int i = 0; i< num.length;i++){
            total +=  num[i];   //  в итоге получится сумма всех элементов массива
            System.out.println(total);
        }
        System.out.println("\n" + total);
        System.out.println("=======================");
        int[]newArr = {2,222,61,2,7,11,103,2,90,85};
        int max = newArr[0];
        for (int i = 1; i< newArr.length; i++){
            if (max < newArr[i]){max = newArr[i];}
        }
        System.out.println(max);
    }
}                                                         // https://youtu.be/-RiS_nFl9ok
