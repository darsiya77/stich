package Archive.File.ZadachiKata;

import java.io.*;

public class SumOfStreamEx {
    public static void main(String[] args) throws IOException {
// ���������� � ���� hello.txt ����� "Hello "
        String str = "Hello ";
        try (FileWriter writer = new FileWriter("hello.txt")){
            writer.write(str);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("The word \"%s\" was written to the \"hello.txt\" file \n", str);
//        -----------------------------------------------------------------------
// ������� ����� ����� byteStream � ���������� ������ ������ � ��������� ����� sumOfStream
        ByteArrayInputStream byteStream = new ByteArrayInputStream (new byte[]{1, 2, 4});
        int byteArrayInputStream = sumOfStream(byteStream);

        System.out.println("int byteArrayInputStream = sumOfStream(byteStream): " + byteArrayInputStream);
//        ______________________________________________________________________________
// ������� ����� ����� fin � ���������� - ���� hello.txt � ��������� ����� sumOfStream
        FileInputStream fin = new FileInputStream( "hello.txt");       // FileInputStream - ��� ���������� ������


        int fileInputStream = sumOfStream(fin);
        System.out.println("int fileInputStream = sumOfStream(fin): " + fileInputStream);

        System.out.println("__________________________");
        byte x = 127;
        int y = 200;
        System.out.println((int)x);
        System.out.println((byte)y);
    }
    public static int sumOfStream(InputStream inputStream) throws IOException {
        int buff;
        int result = 0;
        while ((buff = inputStream.read()) != -1) {
            result += (byte) buff;
        }
        return result;

    }
}

//    �������� ����� int sumOfStream(InputStream inputStream), ������� ��������� InputStream � ���������� ����� ���� ��� ���������.
//    ������ �����: 1, 2, 4, 10
//    ������ ������: 17

// ������: ��� ����� ��������� ������������� InputStream, � ������� ������� ������ - 1,2,4,10