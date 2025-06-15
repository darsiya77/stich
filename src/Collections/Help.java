package Collections;

import java.util.*;

/*
                            JavaCollectionFramework
                            ______ Iterable (I)_________________
                            |                                   |
                       ____Collection (I)________________       |
                      /               |                  |      |
                  List (I)          __Set___              Queue     Map <ключ, значение>
                / /                 |   |  |                     |
           ArrayList (Class)   HashSet  |  TreeSet               HashMap
                                        LinkedHashSet

ArrayList быстрее чем LinkedList при вывполнеии метода .get()

 */
public class Help {
    public static void main(String[] args) {
        int[] arr = new int[4];  // задается опрделенный размер
        String[] arrStr = new String[7];
        arrStr[0] = "str";

//         в Коллекциях размер коллекции изменятемя динамически


//         в List элементы коллекции могут повторяться. Элементы коллекции заполняются по порядку
        List<String> list = new ArrayList<>();
        list.add("str");
        list.add("str");
        list.add("str1");
        System.out.println("List: " + list);            // List: [str, str, str1]

//        В Set хранятся только уникальные значения
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(-2);
        set.add(-100);
        set.add(10);
        set.add(-3);
        set.add(5);
        set.add(-1);

        System.out.println("Set: " + set);             // Set: [1, 2]

//        В Map элементы хранятся в виде (ключ, значение)

        Map<Integer, String> map = new HashMap<>();    // Map: {1=str, 2=str, 3=str}
        map.put(1, "str");
        map.put(2, "str");
        map.put(3, "str");
        map.put(3, "str");
        System.out.println("Map: " + map);
    }
}
