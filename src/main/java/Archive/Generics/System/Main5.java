package Archive.Generics.System;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        while (console.hasNextInt()) {
            arrayDeque.addFirst(console.nextInt());
        }
        StringBuilder sbLine = new StringBuilder();
        int counter = 0;
        for (Integer integer : arrayDeque) {
            if (counter % 2 == 1) {
                sbLine.append(integer).append(" ");
            }
            counter++;
        }
        System.out.print(sbLine.deleteCharAt(sbLine.length() - 1));
    }
}
