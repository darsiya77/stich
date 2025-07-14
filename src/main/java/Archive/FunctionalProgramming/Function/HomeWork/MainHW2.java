package Archive.FunctionalProgramming.Function.HomeWork;

// https://youtu.be/wUp2TLL4F6E?si=c4-iXIZxyYLDjRGr
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class MainHW2 {
    public static void main(String[] args) {
        Function<String, Integer> fun = MainHW2::countConsonants;
        System.out.println("���������� ���������: " + fun.apply("������ ������ ��� ������������."));
    }
    public static int countConsonants(String text) {
        Set<Character> vowels = new HashSet<>(Arrays.asList(
                '�', '�', '�', '�', '�', '�', '�', '�', '�', '�',
                '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'
        ));
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c) && !vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
/*
    ������� ����� ���������� Function<String, Integer> ������� ������ ���������� ��������� ���� �
    ������ ������.
    */
