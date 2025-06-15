package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=sVD35A7lZ5YLRGMH&t=689
// Статический метод concat

import java.util.List;
import java.util.stream.Stream;

public class Ex3_4_concat {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(0, 2, 4, 6);

        List<Integer> list2 = List.of(1, 3, 5, 7);

        Stream<Integer> stream1 = list1.stream();

        Stream<Integer> stream2 = list2.stream();

        Stream<Integer> concatStream = Stream.concat(stream1, stream2);

        concatStream.forEach(System.out::println);

//        В примере показана конкатенация двух потоков целых чисел. На основании списков целых чисел
//        создаются два потока, которые и объединяются в один с помощью статического метода concat.
    }
}

//              Метод static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
//        Данный метод применяется для конкатенации потоков. Т.е. объединение данных двух потоков в
//        один поток. Если используются потоки с сохранением порядка то данные потока b следуют после
//        данных потока a.
