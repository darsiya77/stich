package Archive.FunctionalProgramming.StreamAPI.Ex4_Terminal;

// https://youtu.be/B_9-FqfA514?si=SsRzU2UOOUgSWO8B&t=610
// https://drive.google.com/file/d/1uI3YLnwwBO3gOytfa4vnwOdKCDvAJ3Mt/view
// long count() - вернет количество элементов в потоке.

import java.util.List;
import java.util.stream.Stream;

public class Ex4_3_Count {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(0, 8, 4, 6, 3, 10, 5);

        Stream<Integer> stream = numbers.stream().filter(n -> n % 2 == 1);

        long odd = stream.count();

        System.out.println(odd);
    }
}

//    ¬ примере использу€ терминальный метод count() подсчитываем количество
//    элементов в потоке. ѕо сути считаем сколько в потоке нечетных чисел.
