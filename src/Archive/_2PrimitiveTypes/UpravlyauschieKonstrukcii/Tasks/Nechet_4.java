package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

public class Nechet_4 {
    public static void main(String[] args) {
        printOddNumbers(new int []{3,1,8});
    }
    public static void printOddNumbers(int[] arr) {
        StringBuilder massiv = new StringBuilder("");
        String comma = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                massiv.append(arr[i]).append(",");
                comma = ",";
            }
        }
        System.out.println();
    }
}
