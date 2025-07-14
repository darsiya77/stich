package Archive.FunctionalProgramming.LinkFunction.Ex9;

//������������� ������ � �������� ��������� ������� ������
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1902
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        String[] array = new String[]{"Hallo", "Java"};

        // ������ �� �������������� ��������� ��� � Ex2

        changeStringArray(array, String::toUpperCase); // toUpperCase - ����� ������ String

        System.out.println(Arrays.toString(array));
    }
    // �����, ������� �� ���� ������ ������ ����� � ����� �������, ������� ������ �������� ������, ������ ������:
    // � ������� ���� ����� ������� � ���� ������ ���������� ������� �������� ����� �������.
    // � ���� ������ � ���������� 1 - ����� ������ �� ������, ������� ���� �������� � 2 - ������ ���� �����.������
    public static void changeStringArray(String[] array, StringModificationFunction smf) {
        for (int i = 0; i < array.length; i++) {
            array[i] = smf.modification(array[i]);
        }
    }
}
