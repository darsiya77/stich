package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods.HomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HW1 {
    public static void main(String[] args) {
        String text = "� ����� ������ ���������:\n" +
                       "������ ���� ������� ��,\n" +
                       "��� ���������� �������,\n" +
                       "��� ����� ������ �������.";



        Arrays.stream(text.split("[\\s\\p{Punct}]+"))       // ����� Arrays ������ ����� -> � �����.
                .filter(word -> word.length() <= 5)
                .forEach(System.out::println);
//                .collect(Collectors.joining(" "));                        // ���� � ������ .collect(...)

//        System.out.println(result);
    }
}

//  1) ������� �� ������ ������ ��� ����� ������� 5 ��������.