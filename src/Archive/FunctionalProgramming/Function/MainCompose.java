package Archive.FunctionalProgramming.Function;

// https://youtu.be/wUp2TLL4F6E?si=MmRc7_TjkqwgOebG&t=1262

import java.util.function.Function;

// кака€ функци€ будет вызвана первой, а кака€ второй:
//        ? compose Ч первой параметр, второй текуща€

public class MainCompose {
    public static void main(String[] args) {

        Function<String, String> fun1 = a -> a.replaceAll("[^A-Za-z]", "");

        Function<String, Integer> fun2 = a -> a.length();

        Function<String, Integer> fun3 = fun2.compose(fun1);

        String text = "Hello world 1234, 621, a 15";

        System.out.println(fun3.apply(text));
    }
}
