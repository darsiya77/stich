package Archive.File.ZadachiKata.byteCod;

//https://www.youtube.com/watch?v=4MFcmreAUhs

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printUtf8Bytes('�'); // ������ ������ ������
        System.out.println("____________________________");

        //char[] buffer = new char[]{'�'};
        print('�');
    }
//______________________________����� 1___________________________________
    public static void printUtf8Bytes(char ch) {
        // ����������� ������ � ������
        String str = String.valueOf(ch);

        // �������� ����� � ��������� UTF-8
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

        // ������� ���������� ����������� �������� ���� ����� ������
        for (byte b : bytes) {
            // ����������� ���� � ����������� ����� (0-255)
            int unsignedByte = b & 0xFF;
            System.out.print(unsignedByte + " ");
        }
        System.out.println(); // ������� �� ����� ������
    }
//____________________________����� 2 (� �������)_____________________________________
    public static void print(char c) {
        // ����������� ������ � ������
        String st = String.valueOf(c);
        // �������� ����� � ��������� UTF-8
        byte[] buffer = st.getBytes(StandardCharsets.UTF_8);
        int readByte;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {
        // ������� ���������� ����������� �������� ���� ����� ������, � ������ read() ��� ������ �������������� ����
        // � ����������� ����� (0-255). ������������� ����� ����������� ����� �������
            while ((readByte = bais.read()) != -1) {
                System.out.print(readByte + " ");
            }
        } catch (IOException e) {
            System.out.println("������!");;
        }
    }
}

