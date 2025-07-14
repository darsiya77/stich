package Archive.FunctionalProgramming.Lyambda.Ex3;

// ������ �� ������ ������� � ������������ ���������
// ������ ������� ����� ����� ������ ��� � ����.������� ��� � � ����.�����
//https://youtu.be/ChTVknYsHeU?si=stEud2EOA8TSA72J&t=729
//https://drive.google.com/file/d/1FvFcyijJVyOEV7wCzxxvd6ojP9KRFvMf/view

import Archive.FunctionalProgramming.Lyambda.Ex2.Summator;

public class MathUtilite {
    private static int[] arr = new int[]{1, 2, 3};
    private static Summator summator = () -> getSuma(arr);

    public static void setArr(int[] arr) {
        MathUtilite.arr = arr;
    }
    public static Summator getSummator() {
        return summator;
    }
    public static int getSuma(int[] array) {
        int s = 0;
        for (int element : array) {
            s += element;
        }
        return s;
    }
}
