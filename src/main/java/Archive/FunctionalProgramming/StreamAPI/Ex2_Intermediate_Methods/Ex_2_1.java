package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods;

// https://drive.google.com/file/d/1gKTyaUTEcgRKQxNjV7aWhIZ4-TMuBTlW/view
// https://youtu.be/pzzy-XFrm70?si=pJkz06X5HVLWPDKM&t=187
// Промежуточные методы для фильтрации данных
//Метод filter(Predicate<? super T> predicate)

import java.util.List;
import java.util.stream.Collectors;

public class Ex_2_1 {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(0, 5, -2, 1, -4, 7);

        List<Integer> resultList1 = list1.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());

        System.out.println(resultList1);
//__________________________Последовательное применение filter_____________________________

        List<Integer> list2 = List.of(0, 2, -2, 1, -4, 6);
        List<Integer> resultList2 = list2.stream()
                .filter(n -> n > 0)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(resultList2);

    }
}
