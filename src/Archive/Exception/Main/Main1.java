package Archive.Exception.Main;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        try {
            System.out.println(a/b);
        }
        catch (Exception ex) {
            System.out.println("��� ������� ��������� �������!");
        }
        System.out.println("���������� ���������� (try/catch) ��������� ����������� ������!");
    }
}
// ����� ������ � ������� ���������� ��� �������, ��� �� �� ����������� ������� �� - in.close();