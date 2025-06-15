package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods;

// ����� Stream<T> skip(long n)
// ����� skip(long n) ������������ ��� ����, ��� �� ���������� � ������ ������ n ���������.

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

//          � ���� ������ ����� ������ Stream<Integer> ��������� �� ������ List<Integer>.
//        ����� ���� ��� �������� ������������� ����� filter (�������� ������������� �����), �
//        ����� ����������� ������������� ����� sorted ��� ���������� ������. ����� ����
//        ��������� ����� skip ������������ ������ 4 �������� ������. ������������ �������
//        ��������� forEach ������� ������� ������ ������� ������ �� �����.