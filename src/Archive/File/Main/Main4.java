package Archive.File.Main;

//https://youtu.be/4MFcmreAUhs?si=ZzFmXhVNHadRuENf

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String str = "�";
        str.getBytes();
        System.out.println("�".getBytes(StandardCharsets.UTF_8)[0] + " - 1 ������ ������� � ��������� UTF_8 (1 �� 2-� ����) ��� ������");
        System.out.println("�".getBytes(StandardCharsets.UTF_8)[1] + " - 2 ������ ������� � ��������� UTF_8 (2 �� 2-� ����) ��� ������");
        System.out.println("---------------------");
        System.out.println(Arrays.toString("�".getBytes()) + " - \"�\" � ���� ���������� \"byte\" � ���. 8 ��� � � �������� ���� � ���� 8 ����� ������ ��� �����");
        System.out.println(Arrays.toString("�".getBytes(StandardCharsets.UTF_8)) + " � ��������� UTF_8 \"�\" (������ ������ ��������� ����������� ����� �������) - ������ �� 2-� ����");
        System.out.println("---------------------");
        System.out.print("�".getBytes(StandardCharsets.UTF_8)[0] & 0xFF); // ������� 1-� ���. ������� �� �������
        System.out.println(" - 1 ������ ������� � ��������� UTF_8 (1 �� 2-� ����) �� �������");
        System.out.print("�".getBytes(StandardCharsets.UTF_8)[1] & 0xFF); // ������� 2-� ���. ������� �� �������
        System.out.println(" - 2 ������ ������� � ��������� UTF_8 (2 �� 2-� ����) �� �������");
    }
}
