package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods.HomeWork;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HW2 {
    public static void main(String[] args) {
        String text = "� ����� ������ ���������:\n" +
                "������ ���� ��fd����� ��,\n" +
                "��� ���������� ���SQn����,\n" +
                "��� ����� ������ �������.";


        text.replaceAll("[^A-Za-z]", "").chars().forEach(symbol -> System.out.print((char) symbol));

//        System.out.println(result);
    }
}

//    ������� �� ������ ������� ������� �� �������� ������� ����������� ��������.
