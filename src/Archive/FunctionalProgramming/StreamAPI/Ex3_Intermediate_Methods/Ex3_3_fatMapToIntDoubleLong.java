package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;


// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=YyUH2_4emnZcpq1D&t=557
// ������������� ������ ��� ��������� ������

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex3_3_fatMapToIntDoubleLong {

    public static void main(String[] args) {

        String[] array = new String[] { "C", "Java", "Fortran" };

        IntStream stream = Arrays.stream(array)
                .flatMapToInt(String::codePoints);   // codePoints - ����� ���������� ����� �����-���������, �� ������� ������� ������

        stream.forEach(System.out::println);

//        � ������� �� ������ ������� �������� �������� ������ Stream<String> ��������� ����� �����
//        ����� (��������� ������� ������� � ���� ������) � ��������� ������ ������������ � ����
//        �������������� �����.
    }
}
//        ������:
//        DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)
//        IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
//        LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
//        ������ ������ ��������� ������ ������������ ���� (����������� ������������� Stream) ��
//        ��������� ������� �������� �������� ������. ����������� ������ �������������� � �����
//        ����������� �����.