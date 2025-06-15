package Archive.FunctionalProgramming.Function;

// https://youtu.be/wUp2TLL4F6E?si=C7_O4JDM5Q8FPCpP&t=1357

import java.util.function.Function;

public class MainIdentity {
    public static void main(String[] args) {

        Function<Integer, Integer> fun = Function.identity();

        System.out.println(fun.apply(100));
    }
}
