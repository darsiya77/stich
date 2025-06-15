package Archive.FunctionalProgramming.Function.Ex2_Apply;

// Пример реализации Function с помощью лямбда функции и ссылки на метод
// https://youtu.be/wUp2TLL4F6E?si=0U-q71vwF4Iek63u&t=291

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> fun1 = a -> a.length();

        System.out.println(fun1.apply("Hello"));

        Function<String, Integer> fun2 = String::length;

        System.out.println(fun2.apply("World"));
    }
}
