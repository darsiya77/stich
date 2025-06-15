package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=YsOt4HiSgTJxZhsq&t=991
// ����������� ����� iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)

import java.util.stream.Stream;

public class Ex3_7_iterate {

    public static void main(String[] args) {

        int x = 10;

//        Stream<Integer> stream = Stream.iterate(1, n -> n <= 10, next -> next + 1);

        Stream<Integer> stream2 = Stream.iterate(x, n -> n > 0, next -> -- next);

        stream2.forEach(System.out::println);
    }
}

//              ����� static <T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
//        ������ ����� ����������� ��� �������� ������ ������ �� ��������� ������ ������������ �
//        ������� ���������� ���������� UnaryOperator � seed, ������ ����� �������������� �� ��� ��� ����
//        Predicate ���������� true. ������ ��������� ��� next ����������� � ���������� ������ �����������
//        ������ ����� �� ������. seed ��� ��������� �������� ���������� ����.