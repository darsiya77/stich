package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=SYe1mogLoiQGbbaF&t=1168
// ����������� ����� iterate(T seed, UnaryOperator<T> f)

import java.util.stream.Stream;

public class Ex3_8_iterate {

    public static void main(String[] args) {

        Stream<String> stream = Stream.iterate("A", n -> n + n);

        stream.limit(4).forEach(System.out::println);
    }

//    � ������� ������ iterate �������� Stream<String>. � �������� ���������� ��������
//    ������������ �������� �A�. �� ������ ���� � ������ ������������ ��������� �������� ������. ��
//    ������� ����������� ��������� �����������. ������� ����� ��� ������ ��������� � �����������.
}

//              ����� static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
//        ������ ����� ����������� ��� �������� ������������ ������ ������ �� ��������� ������
//        ������������ � ������� ���������� ���������� UnaryOperator � seed. ������ ��������� ��� next
//        ����������� � ���������� ������ ����������� ������ ����� �� ������. seed ��� ��������� ��������
//        ���������� ����. ����������� ����� ����������, ������� ��� ����� ������������ (�������� �
//        ������� ������ limit).