package Collections.List;

import java.util.LinkedList;
import java.util.List;

/*
ArrayList быстрее чем LinkedList при вывполнеии метода .get()
LinkedList                    внутри этого массива уже индексов нет, есть Ноды. На 5-й элемент есть ссылки только у 6 и 4 эл.
       [] {-[]-} {-[]-} []
        |   |            |
     first Node        last
*/
public class LinkedListEx2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);                              // array[0] = 5
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        System.out.println("list.size = " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i): " + list.get(i));
        }
    }
}
