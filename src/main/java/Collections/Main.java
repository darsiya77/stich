package Collections;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(set2);

        Set<Integer> res = new HashSet<>(set1);
        res.addAll(set2); // 0,1,2,3
        System.out.println(res);
        Set<Integer> copySet1 = new HashSet<>(set1);
        System.out.println(copySet1);
        System.out.println(set2);
        copySet1.retainAll(set2); // 1,2
        System.out.println(copySet1);
        res.removeAll(copySet1);
        System.out.println("__________");
        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> res = new HashSet<T>(set1); // 1, 2, 3
        res.addAll(set2); // 0,1,2,3
        Set<T> copySet1 = new HashSet<T>(set1); // 1, 2, 3
//        retainAll(collection) — удаляет все объекты из текущей коллекции, кроме тех,
//        которые содержатся в коллекции set2.
        copySet1.retainAll(set2); // 1, 2, 3    -   0, 1, 2   =  1, 2
        res.removeAll(copySet1); // 0,1,2,3  -  1, 2
        return res;
    }
}
//    Пример ввода: [1, 2, 3} и {0, 1, 2]