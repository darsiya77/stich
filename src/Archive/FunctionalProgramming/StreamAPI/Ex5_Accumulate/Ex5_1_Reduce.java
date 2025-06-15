package Archive.FunctionalProgramming.StreamAPI.Ex5_Accumulate;

// https://drive.google.com/file/d/1gAxZTWJUb-C13SYfHiUguavWfkUZZWXV/view
// ����� Optional<T> reduce(BinaryOperator<T> accumulator)

//              ������� ��������� ����������� �������� ������. � �������� �������� �������� ������� ������
//        ������� ������ � ����� ��������� ���������� ���������� accumulator � �������� � ����������
//        �������� ������. ����������� ��������� ����������� ������� � ���������� ����������� ���
//        ���������� ��������.

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex5_1_Reduce {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        BinaryOperator<Integer> bop = (a, b) -> a + b;

        Optional<Integer> sum = list.stream()
                .filter(a -> a % 2 == 0)
                .reduce(bop);

        System.out.println(sum.get());
//        _____________________________________________________________

        List<String> worlds = List.of("Java", "Fortran", "Python", "C++");

        BinaryOperator<String> bop2 = (a, b) -> a.length() > b.length() ? a : b;

        Optional<String> result = worlds.stream().reduce(bop2);

        System.out.println(result.get());
//        ___________________________________________________________________


    }
}

//              � ���� ������� ����� reduce ������������ ��� ��������� ����� ���� ������ ����� �� ������.
//        BinaryOperator ��������� ����� ���� ���������. ����� filter � ������ �������� ������ ������ �����.
//        ������� ��������� ���������� ������ ������� � ������. ��� ����� 2, ����� ����������
//        ���������� � �������������� ��������.
