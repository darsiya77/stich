package Archive.File.Exercises;

import java.io.*;
import java.util.Scanner;

public class MaxByte {
    public static void main(String[] args) throws IOException {
        Scanner inn = new Scanner(System.in);
        String fileName = String.valueOf(inn.nextLine());
        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(fileName))) {
            int count1;
            int maxByte = 0;
            int minByte = 127;
            while ((count1 = reader.read()) != -1) {
                if (maxByte < count1) {
                    maxByte = count1;
                }
                if (minByte > count1) {
                    minByte = count1;
                }
            }
            System.out.printf("������������ ���� � ����� \"%s\" = \"%s\" \n", fileName, maxByte);
            System.out.printf("����������� ���� � ����� \"%s\" = \"%s\" \n", fileName, minByte);
        }
    }
}
    /*  ������ � ������� ��� �����
        ����� ������������ ���� � �����, ������� ��� �� �����.
        ������� ����� �����-������*/