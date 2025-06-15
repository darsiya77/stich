package Archive.File.Input_Output_Stream;

import java.io.*;
// https://metanit.com/java/tutorial/6.4.php

/* ������ ByteArrayInputStream � ByteArrayOutputStream. ����� ByteArrayInputStream ������������ ������� �����,
������������ � �������� ��������� ������ ������ ������. �� ����� ��������� ������������:

                                                        ByteArrayInputStream(byte[] buf);
                                                        ByteArrayInputStream(byte[] buf, int offset, int length)

======================================================
� ������� �� ������ ������� ������� ��� �������� ������� ByteArrayInputStream �� ������� �������� ����� CLOSE.
������� ������ ������ � ������� ��� �� �����:
===============================================================================================================
===============================  ������ ������� ������ � ����� ByteArrayInputStream  ===========================
*/
public class ByteArrayOutputStreamEx2 {
    public static void main(String[] args) {

        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {

            System.out.print(b); // �������� �������� ������� array1{1, 3, 5, 7};
        }
        System.out.println();

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // ��������� 5 ��������
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {

            System.out.print((char) c);
        }
        System.out.println("\n");

/*===============================  ������ ������� ���� � ����� ByteArrayOutputStream  ===========================

����� ByteArrayOutputStream ������������ ����� ������, ������������ ������ ������ � �������� ����� ������.
����� ������� ������ ������� ������, �� ����� ������������ ���� �� ��� �������������:

        ByteArrayOutputStream() - ������� ������ ��� �������� ������ ������ � 32 �����
        ByteArrayOutputStream(int size) - ������� ������ ������ size.
*/
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text2 = "Hello Wolrd!";
        byte[] buffer2 = text2.getBytes();
        try {
            baos.write(buffer2);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
                                                               // ���������� ������ ������ � ������
        System.out.println(baos.toString());                   // Hello Wolrd!

                                                               // �������� ������ ������ � ������� �� ���������
        byte[] array = baos.toByteArray();
        for (byte b2 : array) {

            System.out.print((char) b2);
        }                                                      // Hello Wolrd!
        System.out.println();

/*� ������� ������ writeTo �� ����� ������� ������ ���� � ������ �����. ������ ����� � �������� ��������� ���������
������ OutputStream, � ������� ������������ ������ ������� ����:
*/
        ByteArrayOutputStream baos3 = new ByteArrayOutputStream();
        String text3 = "Hello Wolrd!";
        byte[] buffer3 = text3.getBytes();
        try {
            baos3.write(buffer3);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("hello.txt")) {

            baos3.writeTo(fos);
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}

