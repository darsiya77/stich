package Archive.File.ZadachiKata.SumOfDouble2;

import java.io.*;

import java.nio.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        try (scan) {
            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    sum += Double.parseDouble(scan.next());
                } else {
                    scan.next();
                }
            }
            System.out.printf("%.6f", sum);
        } catch (Exception e) {
            System.out.println("���-�� ����� �� ���!");
        }

    }
}
/*

    �������� ���������, �������� ����� �� System.in � ��������� � System.out ����� ���� ����������� � ������
    ������������ ����� � ��������� �� ������� ����� ����� �������. ������ ��������� ������������������ ��������,
    ���������� �� ����������� ������ ��������� ��� ���������� ����� � ������� ����������� ������� Double.parseDouble.

        �� ���� ��� ��� ���� �������� ��������� ���������, �.�. �������� ��������� ����� � ������ Main
        � ����� ����� � ��������� � ����� main. � �������� ��� ����������� �������

        ������ ����� 1: 1 2 3
        ������ ������ 1: 6.000000

        ������ ����� 2: a1 b2 c3
        ������ ������ 2: 0.000000

        ������ ����� 3: -1e3 18 .111 11bbb
        ������ ������ 3: -981.889000
*/
