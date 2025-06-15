package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods;

// Метод default Stream<T> dropWhile(Predicate<? super T> predicate)

import java.util.List;

public class Ex_2_6_dropWhile {
    public static void main(String[] args) {

        List<Integer> list = List.of(0, 5, -2, 0, 3, 1, 1, -4, 7);
        list.stream()
                .dropWhile(n->n>=0)
                .forEach(n -> System.out.println(n));           // -2 0 3 1 1 -4 7
    }
}

//           Метод по умолчанию default Stream<T> dropWhile(Predicate<? super T> predicate)
//        используется удаления первой порции элементов потока для которых реализация
//        Predicate вернет true.