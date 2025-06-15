package Archive.FunctionalProgramming.Function;

// https://youtu.be/wUp2TLL4F6E?si=UBquH4NfOGcoAj0W&t=2089
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view
// Пример применения ToIntBiFunction. Примитивные специализации BiFunction

import java.util.function.ToIntBiFunction;

public class MainToIntBiFun {

    public static void main(String[] args) {

        ToIntBiFunction<Character, Character> fun = (a, b) -> a + b;

        System.out.println(fun.applyAsInt('a', 'b'));
    }
}
