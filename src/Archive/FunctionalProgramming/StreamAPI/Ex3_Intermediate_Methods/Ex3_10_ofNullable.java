package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=VOcCahm_Mwgd0XaU&t=1275
// Пример использования ofNullable

import java.util.stream.Stream;

public class Ex3_10_ofNullable {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.ofNullable("Hello");

        Stream<String> stream2 = Stream.ofNullable(null);

        stream2.forEach(System.out::println);

        stream1.forEach(System.out::println);
    }
}

//                  Метод static <T> Stream<T> ofNullable(T t)
//        Данный метод создает поток на основании одного элемента. Если он не равен null то поток будет
//        содержать единственный элемент, в противном случае будет получен пустой поток.