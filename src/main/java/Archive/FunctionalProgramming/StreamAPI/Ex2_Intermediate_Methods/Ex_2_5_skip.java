package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods;

// ћетод Stream<T> skip(long n)
// ћетод skip(long n) используетс€ дл€ того, что бы пропустить в потоке первые n элементов.

import java.util.List;

public class Ex_2_5_skip {
    public static void main(String[] args) {

        List<Integer> list = List.of(0, 5, -2, 0, 3, 1, 1, -4, 7);
        list.stream()
                .filter(n -> n >= 0)                                  //   0 0 1 1 3 5 7
                .sorted()
                .skip(4)
                .forEach(n -> System.out.println(n));                 //   3 5 7
    }
}

//          ¬ этом пример поток данных Stream<Integer> создаетс€ на основе List<Integer>.
//        ѕосле чего был применен промежуточный метод filter (отбросит отрицательные числа), и
//        потом примен€етс€ промежуточный метод sorted дл€ сортировки потока. ѕосле чего
//        использу€ метод skip пропускаетс€ первые 4 элемента потока. “ерминальным методом
//        выступает forEach который выведет каждый элемент потока на экран.