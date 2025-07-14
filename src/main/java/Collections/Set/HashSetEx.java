package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set хранит только уникальные значения и ХРАНИТ НЕ В ПОРЯДКЕ ДОБАВЛЕНИЯ. Как Map но хранит только ключи
// В реализации Set используется не обычная таблица а Hash табл. или бинарное дерево (нет индексов элементов)
// Любая реализация Set использует Map, но берет из нее только ключи

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("text");
        set.add("text1");
        set.add("text1");
        set.add("text2");
        set.add("text2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("_____");
        /*while (set.iterator().hasNext()) {
            String s = set.iterator().next();
            System.out.println(s);
        }*/

        for (String s : set) {
            System.out.println(s);
        }
    }
}
