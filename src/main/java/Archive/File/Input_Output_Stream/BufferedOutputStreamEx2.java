package Archive.File.Input_Output_Stream;

import java.io.*;

// https://metanit.com/java/tutorial/6.5.php

/*��� ����������� �������� �����-������ ������������ ������������ ������. ��� ������ ��������� � �����������
����������� ����� � ������, � ������� �������� ���������� ������������������ ��� ������ � ������ �������.
����� BufferedInputStream ����������� �������� ������ � ����������� ������ ��� ����������� ��������� � ���������� �����.

    BufferedInputStream(InputStream inputStream)
    BufferedInputStream(InputStream inputStream, int bufSize)

������ �������� - ��� ����� �����, � �������� ������ ����� ����������� � �����. ������ �������� - ������ ������.

��������, ������������ ���������� ������ �� ������ ByteArrayInputStream:
*/

public class BufferedOutputStreamEx2 {
    public static void main(String[] args) {

        String text1 = "Hello world!";
        byte[] buffer1 = text1.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer1);

        try (BufferedInputStream bis = new BufferedInputStream(in)) {

            int c;
            while ((c = bis.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        System.out.println();

/*����� BufferedInputStream � ������������ ��������� ������ InputStream. � ������ ������ ����� �������� �������� ���������
������ ByteArrayInputStream.

��� � ��� ������ ����� BufferedInputStream �������� ������� read(), ������� ��������� ������. � ����� �� ���������
� ������� ������ read ������ ���� �� ������� buffer.

����������� ��� �� �� ����� ����� ���� ������� � � ������� ������ ByteArrayInputStream, �� �������� � �����������������
������. ����� BufferedInputStream ������ ������������ ������������������ ��� ������ � ������� ByteArrayInputStream.
����������� ������ ByteArrayInputStream ����� �������������� ����� ������ �����, ������� ����������� �� InputStream.

����� BufferedOutputStream ���������� ������� ����� ��� ������� ������. ���� ����� ����������� ��������� ����� ���
����������� ��������� � ����������. � ����� ����� ��������, ������������ ������ ������.

        BufferedOutputStream(OutputStream outputStream)
        BufferedOutputStream(OutputStream outputStream, int bufSize)

������ �������� - ��� ����� ������, ������� ����������� �� OutputStream, � ������ �������� - ������ ������.
*/
        String text2 = "Hello world!";                                             // ������ ��� ������
        try (FileOutputStream out = new FileOutputStream("notes.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
                                                                                   // ������� ������ � �����
            byte[] buffer2 = text2.getBytes();
            bos.write(buffer2, 0, buffer2.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
/*����� BufferedOutputStream � ������������ ��������� � �������� ��������� ������ OutputStream - � ������ ������ ���
�������� ����� ������ FileOutputStream. � ����� ������������ ������ � ����. ����� �� BufferedOutputStream �� ���������
����� ����� ����������������, �� ������ ������������ �������� ������ ������.*/

    }
}
