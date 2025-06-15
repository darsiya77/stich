package Archive.Generics.System;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        while (console.hasNextInt()) {
            arrayDeque.addFirst(console.nextInt());
        }
//        System.out.println(arrayDeque);
        int counter = 0;
        for (Integer integer : arrayDeque) {
            if (counter % 2 == 1) {
                System.out.print(integer + " ");
            }
            counter++;
        }
//        System.out.println(0 % 2);// 0

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
    Ќапишите программу, котора€ прочитает из System.in последовательность целых чисел, разделенных пробелами,
    затем удалит из них все числа, сто€щие на четных позици€х, и затем выведет получившуюс€ последовательность
    в обратном пор€дке в System.out.

        ¬се числа влезают в int. ѕозиции чисел в последовательности нумеруютс€ с нул€.

        ¬се import объ€влены за вас.

        ѕример ввода: 1 2 3 4 5 6 7 8 9 10

        ѕример вывода: 10 8 6 4 2
        */
