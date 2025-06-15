package Archive.FunctionalProgramming.LinkFunction.Ex8;

//������������� ������ �� ������ ����� ��������� ������ ����
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1727
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] {"Anna", "Ira", "Alexandr", "Katia"};

//        Comparator<String> cm = Main::compareStringLength;

        Arrays.sort(names, Main::compareStringLength);

        System.out.println(Arrays.toString(names));
    }
    // ���� ����� ��������� �� ���� ������������� �������� � ������ ���������� � ������������:
    public static int compareStringLength(String a, String b) {
        return a.length() - b.length();
    }
}
// �� ����� ��������� ����� ��������� (���������) �������
// ���� ������ ����� - ������ ������������� ����� � ������� �� �����
// ��� ����� ����� ������� ��������� �����, ������� ��������� ��������� ����������
// �� ��� ��� ���������� - �������������� ���������, �� ��� ����� ����������� � ������� ������ �� �����
