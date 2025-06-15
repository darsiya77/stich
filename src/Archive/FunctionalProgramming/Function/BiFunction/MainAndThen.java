package Archive.FunctionalProgramming.Function.BiFunction;

// https://youtu.be/wUp2TLL4F6E?si=f_M8Y5Lg-dAFLTgT&t=1596

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainAndThen {
    public static void main(String[] args) {

        BiFunction<String, String, String[]> fun1 = (a, b) -> a.split(b);

        Function<String[], String> fun2 = a -> String.join("", a);

        BiFunction<String, String, String> fun3 = fun1.andThen(fun2);

        String text = "Java the best";

        String reg = "{1,}\s";  // разбить по одному или большему количеству пробелов

        String result = fun3.apply(text, reg);

        System.out.println(result);
    }
}
