package Archive.FunctionalProgramming.Function.Ex3_Apply;

// ѕример использовани€ Function в качестве параметра метода
// https://youtu.be/wUp2TLL4F6E?si=TFFnrrIiXuG83Ugl&t=389

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        String text = "Java the best!";
        Function<String, Integer> fun = Main::countWhiteSpace;

        System.out.println(applyToStr(text, fun));
    }
    public static Integer applyToStr(String text, Function<String, Integer> fun) {
        return fun.apply(text);
    }
    public static Integer countWhiteSpace(String text) {
        int n = 0;
        char[] s = text.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                n = n + 1;
            }
        }
        return n;
    }
}
