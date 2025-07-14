package Archive.File.File_Input_Output;
//https://metanit.com/java/tutorial/6.3.php

import java.io.*;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
//    =============================================================================================================
//    ��������� ������ �� 1 ����� � ������� � �������:

        try (FileInputStream fin = new FileInputStream("notes3.txt")) {
            int i;
            while ((i = fin.read()) != -1) {

                System.out.print(i);
                System.out.print(" ");
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("\nReed from notes3.txt");

        System.out.println("\n================================\n");

//    =============================================================================================================
//    �������� ������� ����� ������� ������ � ������ ������ � ����� ����������� � ��� �����������:

        try (FileInputStream fin = new FileInputStream("notes3.txt")) {
            byte[] buffer = new byte[256];
            System.out.println("File data:");

            int count;
            while ((count = fin.read(buffer)) != -1) {

                for (int i = 0; i < count; i++) {

                    System.out.print((char) buffer[i]);
                }
            }
            System.out.println("\n================================\n");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
//    =============================================================================================================
//    ��������� ��� ������ � �������� ������ �� ������ � ������ � ������ ����:

        try (FileInputStream fin = new FileInputStream("notes.txt");
             FileOutputStream fos = new FileOutputStream("notes_new.txt")) {
            byte[] buffer = new byte[256];

            int count;
            // ��������� �����
            while ((count = fin.read(buffer)) != -1) {

                // ���������� �� ������ � ����
                fos.write(buffer, 0, count);
            }
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
//  ������ FileInputStream � FileOutputStream ������������� ������ ����� ��� ������ �������� ������, �� ���� ��� ������
//  � ������ ������. � ���� ��� ����� ����� �������������� ��� ������ � ���������� �������, �� ��� �� ��� ����
//  ������ ������ �������� ������ ������.