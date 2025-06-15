package Collections.Map;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream
                ("������� 3000\n������� 9000\n����� 3000\n������� 7000\n����� 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        System.out.println(getSalesMap(buffReader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner scan = new Scanner(reader);
        while (scan.hasNext()) {
            try {
                map.merge(scan.next(), scan.nextLong(), (oldValue, newValue) -> oldValue + newValue);
            } catch (NumberFormatException e) {
                System.out.println("������: �������� ������ ���� ������ ���� Long.");
            }
        }
        return map;
    }
}
/*    �������� ����� ��������� ���������� � �������� ��� ������� ����������.
      �������� ����� Map getSalesMap(Reader reader) ������� ��������� Reader ���������� ������ ����:

        ������� 3000
        ������� 9000
        ����� 3000
        ������� 7000
        ����� 8000

        ����� ������ �������� ��� ������ �� Readera � ��������� � ������� ����� ��� ������ ����� ��� ����������,
        � ��������� ����� ���� ��� ������.

        ������ �����:
        ������� 3000
        ������� 9000
        ����� 3000
        ������� 7000
        ����� 8000

        ������ ������:

        {�������=[10000], �������=[9000], �����=[11000]}*/
