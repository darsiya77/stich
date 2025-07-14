package Archive.FunctionalProgramming.StreamAPI.Ex4_Terminal;

// https://drive.google.com/file/d/1uI3YLnwwBO3gOytfa4vnwOdKCDvAJ3Mt/view
// https://youtu.be/B_9-FqfA514?si=eMmPnEyoh2h_3KBW&t=477
// Методы findAny и findFirst

//  Optional<T> findFirst() - вернет Optional с первым элементом потока если элемент в
//  потоке есть, или пустой Optional если в потоке нет элементов.

//  Optional<T> findAny() - вернет Optional с любым элементом потока если элемент в
//  потоке есть, или пустой Optional если в потоке нет элементов.

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex4_2_FindAnyFirst {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(0, 8, 4, 6, 3, 10, 5);

        Stream<Integer> stream = numbers.stream().filter(n -> n % 2 == 1);

        Optional<Integer> result = stream.findFirst();

        System.out.println(result.get());

//                      В примере мы получаем Optional<Integer> с первым нечетным элементом в потоке
//                (все четные элементы были отброшены из потока с помощью filter).

        List<String> names = List.of("Tom", "Sam", "Bob", "Alice");

        Optional<String> first = names.stream().findFirst();

        System.out.println(first.get()); // Tom



        Optional<String> any = names.stream().findAny();

        System.out.println(any.get()); // Tom
    }
}
