package Archive.File;
//https://platform.kata.academy/user/courses/1/4/2/6

import java.io.*;
import java.util.Arrays;

public class PrintEx {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bytIn = new ByteArrayInputStream(new byte[]{-1, -4, 8, 12, 13, 1, 2});
        ByteArrayOutputStream bytOut = new ByteArrayOutputStream();
        print(bytIn, bytOut);
        byte[] array = bytOut.toByteArray();
        System.out.println(Arrays.toString(array));

    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int buff;
        while ((buff = inputStream.read()) != -1) {
            if (buff % 2 == 0) {
                outputStream.write(buff);
            }
        }
        outputStream.flush();
    }
}
/* �������� ����� void print(InputStream inputStream, OutputStream outputStream) ������� ��������� InputStream �
OutputStream, ��������� ��� ����� �� inputStream � ���������� � OutputStream ������ ������.

������ �����: 3, 10, 4, 5, 7
������ ������: 10, 4*/
