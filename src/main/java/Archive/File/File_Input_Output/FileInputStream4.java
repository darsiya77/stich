package Archive.File.File_Input_Output;

import java.io.*;


public class FileInputStream4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("HelloAndreyT.txt");
        int i;
        while ((i = fin.read()) != -1) {
            System.out.print((char)i);
        }
        fin.close();
        System.out.println("");
    }
}
// ��� ������ �� ����� -  FileInputStream
// ��� ������� ���������� ����� read
// ���� ��������� (i = fin.read()) != -1 - true, �������� ����������� - System.out.print((char)i)
// read ����� ������ �� ��� ���, ���� ������ �� ��������� � ����� ����� read ������ -1
// ������ �����/������ ����� ������ ���� ��������� - fin.close();
// https://www.youtube.com/watch?v=X2K9HGnBJWQ