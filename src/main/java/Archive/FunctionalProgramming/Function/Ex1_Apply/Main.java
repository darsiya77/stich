package Archive.FunctionalProgramming.Function.Ex1_Apply;

// Пример реализации Function с помощью класса
// https://youtu.be/wUp2TLL4F6E?si=5rIiprrvTUIAKh5E&t=103
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, Integer> fun = new StrToLength();

        System.out.println(fun.apply("Hello"));
    }
}
class StrToLength implements Function<String, Integer> {
    @Override
    public Integer apply(String t) {
        return t.length();
    }
}
