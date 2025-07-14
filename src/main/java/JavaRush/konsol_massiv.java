package JavaRush;

import java.util.Scanner;

public class konsol_massiv {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите значение:");
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        System.out.println("___________________");
        for (int n : array) {
            System.out.println(n);
        }
            System.out.println("__________________");
            for (int i = array.length-1; i >= 0; i--){
                //array[i] = i - array[i];
                System.out.println(array[i]);
            }
    }
}
