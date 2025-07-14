package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=_uBG3wqja9Yts8Az&t=1201
// Пример применения метода of

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3_9_of {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Hello", "World");

        List<String> list = stream.collect(Collectors.toList());

        System.out.println(list);
    }
//    В данном примере создается поток строк на основании двух элементов «Hello», «World».
}

//                  Методы
//              static <T> Stream<T> of(T t)
//              static <T> Stream<T> of(T... values)
//        Данные методы создают поток или на основании одного элемента или на основании нескольких
//        элементов. По сути это просто еще один способ создания потока на основании имеющихся данных.