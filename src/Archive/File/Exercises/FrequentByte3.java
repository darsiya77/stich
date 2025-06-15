package Archive.File.Exercises;

//https://www.youtube.com/watch?v=SRbOBiUl2ZQ

import java.io.*;
import java.util.*;

public class FrequentByte3 {
    public static void main(String[] args) throws IOException {
        int num;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList <Integer> arrayList = new ArrayList<>();

        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            while (in.available() > 0) {
                int i = in.read();
                arrayList.add(i);
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            num = Collections.frequency(arrayList, arrayList.get(i));
            map.put(arrayList.get(i), num);
        }

        int count = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == count) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
// notes3.txt


  /*    Ввести с консоли имя файла
        Найти байт или байты с максимальным количеством повторов
        Вывести их на экран через пробел.
        Закрыть поток ввода-вывода*/