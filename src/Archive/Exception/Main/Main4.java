package Archive.Exception.Main;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        if (a > 50) {
            throw new Exception("������� ������� �����!");
        }
        System.out.println("��������� ����������� ������!");
        System.out.println("��������� ���������!");
    }
}
// ����������� ���������� � ����.������ - throws, ����� ��������� throw new Exception("������� ������� �����!")
// ��������� ���������� ���������� � ����������� - ��������� ��� �� �����������