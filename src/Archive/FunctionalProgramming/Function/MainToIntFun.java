package Archive.FunctionalProgramming.Function;

// https://youtu.be/wUp2TLL4F6E?si=56g7uK1-On7JOkpZ&t=1908
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view
// Пример применения ToIntFunction. Производящие примитивные специализации Function

import java.util.function.ToIntFunction;

public class MainToIntFun {

    public static void main(String[] args) {

        ToIntFunction<String> fun = a -> a.hashCode(); // на вход принимает String, возвращает int

        System.out.println(fun.applyAsInt("Hello"));
    }
}
