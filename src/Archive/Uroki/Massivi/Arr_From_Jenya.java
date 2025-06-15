package Archive.Uroki.Massivi;

public class Arr_From_Jenya {
    public static void main(String[] args) {
        printArray1(new int[]{1, 2, 3, 4});
        printArray2(new int[]{1, 2, 3, 4});
        System.out.println("\n" + 3/2);
    }

    //========================== 1 способ =================================================================
    public static void printArray1(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println("]");
                }

            }
        }
    }//============================= 2 способ ==================================

static void printArray2(int[] numbers) {
    if (numbers.length == 0) {
        System.out.println("[]");
    } else {
        System.out.print("[");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1] + "]");
    }
}
}
