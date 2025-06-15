package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

public class Nechet_2 {
    public static void main(String[] args) {
        printOddNumbers(new int []{2});
    }
    public static void printOddNumbers(int[] arr) {
        int i = 0;
        while (arr[i] % 2 == 0) {
            i++;
        }
        System.out.print(arr[i]);
        i++;
        for (; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(","+arr[i]);
            }
        }
        System.out.println();
    }
}
