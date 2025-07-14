package Archive.FunctionalProgramming.Function.Ex4_Apply;

// ѕример использовани€ Function в качестве параметра метода
// https://youtu.be/wUp2TLL4F6E?si=rSCD916QkUlgWcp3&t=505

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("Java", "Python", "Fortran", "C");

        Function<String, Integer> fun = a -> a.length();

        List<Integer> resList = applyAndCreate(fun, list);

        System.out.println(resList);
    }
    public static <R, T> List<R> applyAndCreate(Function<T, R> fun, List<T> list) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            resultList.add(fun.apply(t));
        }
        return resultList;
    }
}
