package JavaRush;

import java.util.Arrays;

public class task0519TheSerchElement {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, -1};
    public static int element = -1;

    public static void main(String[] args) {
        int[]x = Arrays.copyOf(array,array.length);
        Arrays.sort(x);
        int y = Arrays.binarySearch(x, element);
        System.out.println(y >= 0);
    }
}
    /*�������� ����� main(String[]), ������� ������� � ������� true, ���� ������� ���������� � ���������� �������, ����� � false.
        ������ array �� ������ �������� ������������ ����� ���������.

        ��� ������ �������� � ������� ����� �������� �����. ����� ��� �������, ��������� ����������� ����� Arrays.binarySearch(int[], int) ������ Arrays. ������ ���������� ����� �������� ��������������� ������, � ������� ��������� �����, ������ ���������� � ������� �������. ����� Arrays.binarySearch(int[], int) ���������� ������ �������� ��������, ���� ����� ������� ���� � �������.

        ��� ���������� ������� ����� ������������ ����� Arrays.sort(int[]).
        ��� ������������ �������� ���������� ������ Solution ����� �������.

        ����������:
        �	� ������ main(String[]) �� ������� ������������ ��������� ������� array.
        �	��� ������ ������ main(String[]) ������� � ������� true, ���� �������� ���������� element ���������� � �������.*/