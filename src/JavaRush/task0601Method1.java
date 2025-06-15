package JavaRush;

import java.util.Arrays;

public class task0601Method1 { public static void main(String[] args) {
    int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
    printArray(array);
    reverseArray(array);
    printArray(array);
}

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int hash = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = hash;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
    /*����� main ������� ������� ����� ����� ���������� � ��������� ��������.
        ���� �� ������� ��������� ����� ���������� � �������� � �� ������� ��� �� ������ ������.
        ������ public static void printHydrogenInfo() �����, ������� ������ �������� ��� ������ � ��������.
        ����� ������ public static void printJavaInfo() �����, ������� ����� �������� ��� ������ �� ������� ���.
        �������, � ������ main() ������ ��� ��� ������.
        ����� ����� � ������� �� ������ ����������.

        ����������:
        �	������ ������������ public static void printHydrogenInfo() �����.
        �	������ ������������ public static void printJavaInfo() �����.
        �	����� printHydrogenInfo() ������ �������� ��� ������������ ������ � ��������.
        �	����� printJavaInfo() ������ �������� ��� ������������ ������ �� ������� ���.
        �	� ������ main() ������ ���������� ������ printHydrogenInfo() � printJavaInfo().
        �	����� ����� � ������� �� ������ ����������.*/