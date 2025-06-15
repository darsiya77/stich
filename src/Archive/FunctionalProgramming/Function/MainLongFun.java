package Archive.FunctionalProgramming.Function;

// https://youtu.be/wUp2TLL4F6E?si=y_z9iutbMG5JeL3d&t=1803
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view
// Пример применения LongFunction. Принимающие примитивные специализации Function

import java.util.Date;
import java.util.function.LongFunction;

public class MainLongFun {

    public static void main(String[] args) {

        LongFunction<Date> fun1 = a -> new Date(a);  // на вход принимает Long, возвращает Date

        System.out.println(fun1.apply(4_00_000_000_000L));
    }
}
