package Archive.File.ZadachiKata;

import java.io.*;
import java.util.Arrays;

public class PrintEx {
    public static void main(String[] args) throws IOException {

        String str = "Hello";   // [72 101 108 108 111]
        ByteArrayInputStream byteStreamIn = new ByteArrayInputStream(str.getBytes());   // [72 101 108 108 111]
        ByteArrayOutputStream byteStreamOut = new ByteArrayOutputStream();
        FileOutputStream fos = new FileOutputStream("byteStreamOut.txt");


        System.out.println(new String(str.getBytes(), 0, str.getBytes().length));

        print(byteStreamIn, byteStreamOut);


        System.out.println(byteStreamOut);
        System.out.println(Arrays.toString(byteStreamOut.toByteArray()));

        byteStreamOut.writeTo(fos);
        System.out.printf("\"%s\" is written to the \"%s\" file", byteStreamOut, "byteStreamOut.txt");

    }
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int buff;
        while ((buff = inputStream.read()) != -1) {
            if ((buff % 2) == 0) {
                outputStream.write(buff);
            }
            outputStream.flush();

        }
    }
}
/*
    �������� ����� void print(InputStream inputStream, OutputStream outputStream) ������� ��������� InputStream
    � OutputStream, ��������� ��� ����� �� inputStream � ���������� � OutputStream ������ ������.

        ������ �����: 3, 10, 4, 5, 7

        ������ ������: 10, 4



        ����������:

        1. ����� ������ ���� ���������.

        2. ��������� ������ ����� ��� InputStream inputStream � OutputStream outputStream.

        3. ��������� ������ ������ ����: print(InputStream inputStream, OutputStream outputStream)*/
