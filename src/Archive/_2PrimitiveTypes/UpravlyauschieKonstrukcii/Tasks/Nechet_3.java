package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

public class Nechet_3 {
    public static void main(String[] args) {
        printOddNumbers(new int[]{2, 3, 5, 20, 8, -7, 1, 100});
        Nechet_3 a = new Nechet_3();
        a.parseAndPrintNumber("222");
    }
    public void parseAndPrintNumber(String str) {
        System.out.println(Integer.parseInt(str) / 2);
    }

    public static void printOddNumbers(int[] arr) {
        String comma = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(comma + arr[i]);
                comma = ",";
            }
        }
        System.out.println();
    }

}
