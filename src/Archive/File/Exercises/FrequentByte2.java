package Archive.File.Exercises;

//https://www.youtube.com/watch?v=SRbOBiUl2ZQ

import java.io.*;
import java.util.*;


public class FrequentByte2 {
    public static void main(String[] args) throws IOException {
        int[] byteCount = new int[256];
        int count = 0;
        ArrayList <Integer> arrayList = new ArrayList<>();
        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            while (in.available() > 0) {
                int i = in.read();
                byteCount[i]++;
            }
        }
        //        {72[1],101[6],32[6],108[2],111[1]}
        for (int i : byteCount) {
            if (i > count) {
                count = i;
            }
        }

        for (int i = 0; i < byteCount.length; i++) {
            if (byteCount[i] == count) {
                arrayList.add(i);
            }
        }

        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }

        // 1

    }
}
// notes3.txt


  /*    Ввести с консоли имя файла
        Найти байт или байты с максимальным количеством повторов
        Вывести их на экран через пробел.
        Закрыть поток ввода-вывода*/