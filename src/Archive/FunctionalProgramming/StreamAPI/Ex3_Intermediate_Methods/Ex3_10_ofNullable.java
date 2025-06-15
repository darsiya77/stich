package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=VOcCahm_Mwgd0XaU&t=1275
// ������ ������������� ofNullable

import java.util.stream.Stream;

public class Ex3_10_ofNullable {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.ofNullable("Hello");

        Stream<String> stream2 = Stream.ofNullable(null);

        stream2.forEach(System.out::println);

        stream1.forEach(System.out::println);
    }
}

//                  ����� static <T> Stream<T> ofNullable(T t)
//        ������ ����� ������� ����� �� ��������� ������ ��������. ���� �� �� ����� null �� ����� �����
//        ��������� ������������ �������, � ��������� ������ ����� ������� ������ �����.