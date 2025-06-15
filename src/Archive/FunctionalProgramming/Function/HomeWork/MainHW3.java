package Archive.FunctionalProgramming.Function.HomeWork;

// https://youtu.be/wUp2TLL4F6E?si=c4-iXIZxyYLDjRGr
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view

import java.util.function.Function;

public class MainHW3 {
    public static void main(String[] args) {
        Function<String, char[]> fun1 = text -> text.toCharArray();

        Function<char[], Integer> fun2 = charArray -> {
            Integer num = 0;
            for (Character character : charArray) {
                num += (int) character;
            }
            return num;
        };

        Function<String, Integer> fun3 = fun2.compose(fun1);
        System.out.println(fun3.apply("������ ������ ��� ������������."));
        System.out.println(sumCodes("������ ������ ��� ������������."));
    }
    // ___________________������ ������ ����� Stream API __________________________________
    public static int sumCodes(String s) {
        return s.chars().sum();
    }
}

/*
    ��������� ���������� ������� ���������� ������� ������� ������ ����� ����� �������
    ������� � ������������ ������.

    */
