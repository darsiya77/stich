package Archive.FunctionalProgramming.KataEx.Ex1;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator u = sqrt();
        System.out.println(u.apply(5));
    }
    public static UnaryOperator<Integer> sqrt() {

        return x -> (int) Math.pow(x, 2);
    }
}

//    �������� ����� � ��������� sqrt, ������� ���������� ���������� ��������������� ���������� UnaryOperator,
//    ������� ��������� ����� �����(��� int) � ���������� ��� �������.
//
//
//
//        ����������:
//
//        1. ������ ���� ����� public UnaryOperator sqrt()
//
//        2. ����� ������ ���������� ���������� ���������� UnaryOperator.
//
//        3. ���������� ������ ��������������� �������

