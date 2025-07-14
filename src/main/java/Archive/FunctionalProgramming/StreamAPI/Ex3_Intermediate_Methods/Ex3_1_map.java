package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=FDlAAv_evC33YAMd&t=97
// ������������� ������ ��� ��������� ������

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3_1_map {
    public static void main(String[] args) {

        List<String> list = List.of("Java", "Python", "Fortarn", "C");

        Stream<Integer> stream = list.stream().map(String::length);

        stream.forEach(n -> System.out.println(n));
        System.out.println();
//        ______________________________________________________________________________
//        https://youtu.be/P_MZQhMsiDA?si=2cvY1BE-h5lCTqHK&t=275
//        ______________________________________________________________________________
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("UmkA", 7, "Black");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4 };

        List<String> result = Arrays.stream(cats)
                .filter(n -> n.getWeight() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}

//    ����� <R> Stream<R> map(Function<? super T,? extends R> mapper)
//    ����� <R> Stream<R> map(Function<? super T,? extends R> mapper) ������������ ���
//    �������� ������ ������ �� ��������� ������ ������������� ������. �������� ������
//        ������ ����������� �� ������ ��������� ������������� ������ ����� ����������
//        ���������� Function.