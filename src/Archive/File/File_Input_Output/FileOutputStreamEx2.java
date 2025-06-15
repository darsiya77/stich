package Archive.File.File_Input_Output;
import java.io.*;   // ����������� ����������, ���. �������� �� ������ �����/������
public class FileOutputStreamEx2 {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        String str2 = " Super World!";
        FileOutputStream fos = new FileOutputStream("HelloAndreyT.txt", true);   // ������������� ��������� ���� ����� ���
        //"C:\\Users\\������\\Downloads\\Java\\File\\Hello.txt"
        byte[] buffer = str.getBytes();
        fos.write(buffer);            // - 1 ������
        buffer = str2.getBytes();
        fos.write(buffer);            // - 2 ������
        fos.write(buffer[7]);         // - 3 ������
        fos.write(buffer[0]);         // - 3 ������
        fos.close();
        System.out.println("The file has been written");

        // ��� �� ���������� ������ � ���� ����� ������� ����� ��� ������ � ���. ������ FileOutputStream
        // �-� ��������� ���� � ����� ��� ������, ���� ������ ����� ��� �� �� ������������� ���������
        // new FileOutputStream("...") - ����� ���������� ���������� - ������ � ����� �� ����������
        // �������� �����-� ��� ������ � ���� �� �� �����, ����� FileOutputStream �������� � �������, � � ���� ���������� String str
        // � ���� �� ��������� � ������ � ������� - ��������� ������ � ����� ������� getBytes()
        // ��� �� �������� ��� ����� � ���� ������������ ������� write
        // ����� write ����� ����������� �������� � ������ ������� ��������� ����������
        // ����� �������� � ���� � ������� ������� - fos.write(buffer[1]);
        // https://www.youtube.com/watch?v=X2K9HGnBJWQ


    }
}
