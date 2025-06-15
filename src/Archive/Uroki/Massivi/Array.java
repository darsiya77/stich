package Archive.Uroki.Massivi;

public class Array {
    public static void main(String[] args) {

        printArray(new int []{2,4,6});  // как в дз просиили - делаем.

        System.out.println("\n"); // печатаю что бы разделить два sout; "\n" - энтер.

        System.out.println("printArrays  (31,500,17): ");
        printArrays(31,500,17);  // вот так сокращенноо можно вызвать метод с массивом без всяких - new int []{...}
        System.out.println();
        System.out.println("___________________");
        System.out.println("printArr(new int [] {1,2,3,4}):  ");
        printArr(new int []{1,2,3,4});
    }
    static void printArray(int[] arr){            // делаем как просят в задании
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
    //-----------------------------------------------------------------------------------------------------------------
    static void printArrays (int... arr){       // Объявляем массив сокращенно, что бы можно было легче вызвать его потом
        if (arr.length == 0){
            System.out.println("[]");
        }
        else {
            System.out.print("[");
            for (int i = 0; i < arr.length-1; i++) {       //  вызываем цикл, который будет перебирать каждый элемент массива
                //  по каждому индексу массива и выводить на печать кроме последнего [i],
                System.out.print(arr[i] + " ,");
            }
            System.out.print(arr[arr.length - 1] + "]");     //  а последний элемент массива по индексу вызываем на печать методом
            // sout без ln, что бы не перебрасвал на след.строку
        }
    }
    //_______________________________________
    static void printArr(int[] numbers) {
        if (numbers.length == 0){
            System.out.println("[]");
        }
        else {
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    System.out.print("[");
                }
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println("]");
                }
            }
        }
    }
}
