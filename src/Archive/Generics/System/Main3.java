package Archive.Generics.System;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int counter = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (console.hasNextInt()) {
            counter++;
            if (counter % 2 == 0) {
                arrayList.add(console.nextInt());
            } else {
                console.next();
            }
        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
//
//    Scanner console = new Scanner(System.in);
//    String[] consoleLine = console.nextLine().split(" ");
//    StringBuilder sbLine = new StringBuilder();
//        for (int i = consoleLine.length - 1; i >= 0; i--) {
//                if (i % 2 == 1) {
//                sbLine.append(consoleLine[i]).append(" ");
//                }
//                }
//                System.out.println(new String(sbLine.deleteCharAt(sbLine.length() - 1)));

/*
    �������� ���������, ������� ��������� �� System.in ������������������ ����� �����, ����������� ���������,
    ����� ������ �� ��� ��� �����, ������� �� ������ ��������, � ����� ������� ������������ ������������������
    � �������� ������� � System.out.

        ��� ����� ������� � int. ������� ����� � ������������������ ���������� � ����.

        ��� import ��������� �� ���.

        ������ �����: 1 2 3 4 5 6 7 8 9 10

        ������ ������: 10 8 6 4 2
        */
