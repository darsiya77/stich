package JavaRush;

import java.util.Arrays;

public class DelenieZapolnenieMassivatask0517 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int x = (array.length % 2 == 0) ? array.length/2 : array.length/2+1;
        result[0] = Arrays.copyOfRange(array, 0,x);
        result[1] = Arrays.copyOfRange(array,x,array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
    /*�������� ����� main(String[]), ������� ����� ������ array �� ��� ���������� � ��������� ��� ���������
    ������ result. ���� ����� ������� ��������, �� ������� ����� ����� ����������� � ������ ���������.
        ��� ���������� ������� ��������� ����� Arrays.copyOfRange(int[], int, int). ������� ��������� �� �����.
        ��� ������������ �������� ����� ������ Solution ����� �������, ���� ���.

        ����������:
        �	�������� ����� main(String[]) �������� �������.*/