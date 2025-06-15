package Archive.File.ZadachiKata;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.util.*;

// �������� �������: ���� ���� (���� ���� ��� ������ � ������� scan.hasNext()) {(���� �� ��� ��������� ����
// scan.hasNextDouble() �� ) {sum += ���� Double.parseDouble(scan.next()) } ���� ��� {�������� ������ scan.next() } }.
// ����� ������ �� ������ System.out.printf("%.6f", sum)

/*      IDEA, ����� ����� � ����������, ���� Enter � ����������� - Ctrl D.
        ��� ����� ���� ������, ��� ���� ��������!!! �����, ��� ��������� �����,
        ����� ��������� ����� ��� ���������� �������� �����.*/

public class SumOfDouble {
    public static void main(String[] args) {
        double sum = 0;
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    sum += Double.parseDouble(scan.next());
                } else {
                    scan.next();
                }
            }

            System.out.printf("%.6f", sum);
        } catch (Exception e) {
            System.out.printf("%.6f", 0);
        }
    }
}
    /*
    �������� ���������, �������� ����� �� System.in � ��������� � System.out ����� ���� ����������� � ������
    ������������ ����� � ��������� �� ������� ����� ����� �������.

    ������ ��������� ������������������ ��������, ���������� �� ����������� ������ ��������� ��� ���������� �����
    � ������� ����������� ������� Double.parseDouble.

    �� ���� ��� ��� ���� �������� ��������� ���������, �.�. �������� ��������� ����� � ������ Main � ����� �����
    � ��������� � ����� main. � �������� ��� ����������� �������
    ������ ����� 1: 1 2 3

������ ������ 1: 6.000000



������ ����� 2: a1 b2 c3

������ ������ 2: 0.000000



������ ����� 3: -1e3 18 .111 11bbb

������ ������ 3: -981.889000
    */