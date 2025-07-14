package Archive.FunctionalProgramming.Function;

// https://youtu.be/wUp2TLL4F6E?si=0H9Qrek5fEBtfnV4&t=1034

import java.util.Arrays;
import java.util.function.Function;

// кака€ функци€ будет вызвана первой, а кака€ второй:
//        ? andThen Ч перва€ текуща€, второй параметр.

public class MainAndThen {
    public static void main(String[] args) {

        Function<String, String[]> fun1 = a -> a.split(" ");

        Function<String[], int[]> fun2 = MainAndThen::getLength;

        Function<String, int[]> fun3 = fun1.andThen(fun2);

        int[] result = fun3.apply("Java the best");

        System.out.println(Arrays.toString(result));
    }
    public static int[] getLength(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i].length();
        }
        return result;
    }
}
