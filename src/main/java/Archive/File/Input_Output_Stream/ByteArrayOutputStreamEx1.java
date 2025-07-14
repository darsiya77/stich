package Archive.File.Input_Output_Stream;
//https://metanit.com/java/tutorial/6.4.php
import java.io.*;

//������������:
//ByteArrayOutputStream()               -      ������� ������ ��� �������� ������ ������ � 32 �����
//ByteArrayOutputStream(int size)       -      ������� ������ ������ size


public class ByteArrayOutputStreamEx1 {
    public static void main(String[] args) {

        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        String text1 = "Hello Wolrd!";
        byte[] buffer1 = text1.getBytes();
//        System.out.println(Arrays.toString(buffer1));
        try {
            baos1.write(buffer1);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        // ���������� ������ ������ � ������
        System.out.println(baos1);

        // �������� ������ ������ � ������� �� ���������
        byte[] array = baos1.toByteArray();
        for (byte b : array) {

            System.out.print(b + " ");
        }
        System.out.println();

// ��������� ������ toString() � toByteArray(), ����� �������� ������ ������ buf � ���� ������ ��� ��������������� � ���� ������� ����.

// � ������� ������ writeTo �� ����� ������� ������ ���� � ������ �����. ������ ����� � �������� ��������� ���������
// ������ OutputStream, � ������� ������������ ������ ������� ����:

        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        String text2 = "Hello Wolrd!";
        byte[] buffer = text2.getBytes();
        try {
            baos2.write(buffer);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("hello.txt")) {

            baos2.writeTo(fos);
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
        System.out.println("\"Hello Wolrd!\" is written to the \"hello.txt\" file");
    }
}
