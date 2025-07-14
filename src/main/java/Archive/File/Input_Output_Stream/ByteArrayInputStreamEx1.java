package Archive.File.Input_Output_Stream;

//https://metanit.com/java/tutorial/6.4.php

import java.io.*;

//��� ������ � ��������� ������ - �� ������ � ������ ������������ ������ ByteArrayInputStream � ByteArrayOutputStream.
//����� ByteArrayInputStream ������������ ������� �����, ������������ � �������� ��������� ������ ������ ������.

public class ByteArrayInputStreamEx1 {
    public static void main(String[] args) {

        byte[] array1 = new byte[]{72, 101, 108, 108, 111};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {

            System.out.println(b);
        }

        System.out.println("====================");

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // ��������� 5 ��������
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {

            System.out.println((char) c);
//� ������� �� ������ ������� ������� ��� �������� ������� ByteArrayInputStream �� ��������� �������� ����� close.
        }
    }
}
