package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=_uBG3wqja9Yts8Az&t=1201
// ������ ���������� ������ of

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3_9_of {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Hello", "World");

        List<String> list = stream.collect(Collectors.toList());

        System.out.println(list);
    }
//    � ������ ������� ��������� ����� ����� �� ��������� ���� ��������� �Hello�, �World�.
}

//                  ������
//              static <T> Stream<T> of(T t)
//              static <T> Stream<T> of(T... values)
//        ������ ������ ������� ����� ��� �� ��������� ������ �������� ��� �� ��������� ����������
//        ���������. �� ���� ��� ������ ��� ���� ������ �������� ������ �� ��������� ��������� ������.