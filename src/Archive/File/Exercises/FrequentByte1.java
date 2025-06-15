package Archive.File.Exercises;

//https://www.youtube.com/watch?v=SRbOBiUl2ZQ

import java.io.*;
import java.util.*;

public class FrequentByte1 {

    public static void main(String[] args) throws IOException {

        HashMap<Integer, Integer> map = new HashMap<>();

        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {

            while (in.available() > 0) {
                int i = in.read();
                //1
                if (!map.containsKey(i)) {
                    map.put(i, 0);
                } else {
                    map.put(i, map.get(i) + 1);
                }
            }
        }
//        {[72, 0] [101, 0] [108, 0] [108, 1]}
        // 1
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