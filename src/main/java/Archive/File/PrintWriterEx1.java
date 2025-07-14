package Archive.File;
//https://metanit.com/java/tutorial/6.6.php
//        �� PrintStream ����� ������ ����� PrintWriter.
//        ��� ����� ������������ ��� ��� ������ ���������� �� �������, ��� � � ���� ��� ����� ������ ����� ������.
//
//        PrintWriter(File file): ������������� ��������� ���������� � ��������� ����
//
//        PrintWriter(File file, String csn): ������������� ��������� ���������� � ��������� ���� � ������ ��������� csn
//
//        PrintWriter(OutputStream out): ��� ������ ���������� ������������ ������������ ������ OutputStream, �������������
//        ��������� � ���� ������
//
//        PrintWriter(OutputStream out, boolean autoFlush): ��� ������ ���������� ������������ ������������ ������ OutputStream,
//        ������ �������� ���������, ���� �� ������������� ��������� � OutputStream ������
//
//        PrintWriter(String fileName): ������������� ��������� ���������� � ���� �� ���������� �����
//
//        PrintWriter(String fileName, String csn): ������������� ��������� ���������� � ���� �� ���������� �����,
//        ��������� ��������� csn
//
//        PrintWriter(Writer out): ��� ������ ���������� ������������ ������������ ������ Writer, � ������� �������������
//        ���� ������ ������
//
//        PrintWriter(Writer out, boolean autoFlush): ��� ������ ���������� ������������ ������������ ������ Writer,
//        ������ �������� ���������, ���� �� ������������� ��������� � Writer ������

//        ��� ������ ������ � ����� �� ����� ������������ ������ printf() � println().

import java.io.PrintWriter;

public class PrintWriterEx1 {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(System.out)) {
            pw.println("Hello world!");
        }
    }
}
