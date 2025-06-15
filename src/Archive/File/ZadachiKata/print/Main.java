package Archive.File.ZadachiKata.print;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] buffer = new byte[]{3, 10, 4, 5, 7};
        ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (bais; baos) {
            print(bais, baos);
        } catch (IOException e) {
            System.out.println("������ ���!");
        }
        byte[] array = baos.toByteArray();
        System.out.println(Arrays.toString(array));

    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int readByte;
        while ((readByte = inputStream.read()) != -1) {
            if (readByte % 2 == 0) {
                outputStream.write(readByte);
            }
            outputStream.flush();
        }
    }
}
/*
�������� ����� void print(InputStream inputStream, OutputStream outputStream) ������� ���������
InputStream � OutputStream, ��������� ��� ����� �� inputStream � ���������� � OutputStream ������ ������.

        ������ �����: 3, 10, 4, 5, 7
        ������ ������: 10, 4
        */
