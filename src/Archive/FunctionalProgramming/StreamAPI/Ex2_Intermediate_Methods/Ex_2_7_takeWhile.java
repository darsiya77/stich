package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods;

// Метод default Stream<T> takeWhile(Predicate<? super T> predicate)

import java.util.List;

public class Ex_2_7_takeWhile {
    public static void main(String[] args) {

        List<Integer> list = List.of(0, 5, -2, 0, 3, 1, 1, -4, 7);

        list.stream()
                .takeWhile(n -> n >= 0)
                .forEach(n -> System.out.println(n));               //  0 5
    }
}

//    Метод по умолчанию takeWhile(Predicate<? super T> predicate) используется для того
//    что бы оставить в потоке первую порцию элементов потока для которых реализация
//    Predicate вернет true. Остальные элементы потока будут отброшены