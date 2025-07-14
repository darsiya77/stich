package Archive.FunctionalProgramming.Function.BiFunction;

// https://youtu.be/wUp2TLL4F6E?si=AzUgAmG0ZMwsDR6J&t=1535


import java.util.function.BiFunction;

public class MainApply {

    public static void main(String[] args) {

        BiFunction<String, Character, Integer> countLetter = MainApply::count;

        System.out.println(countLetter.apply("Hello", 'l'));
    }
    public static Integer count(String letter, Character l) {
        int result = 0;
        char[] ls = letter.toCharArray();
        for (int i = 0; i < ls.length; i++) {
            if (ls[i] == l) {
                result++;
            }
        }
        return result;
    }
}
