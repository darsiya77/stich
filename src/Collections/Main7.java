package Collections;

import java.util.HashSet;
import java.util.Set;

public class Main7 {
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
//        Set<Integer> copySet1 = new HashSet<>(set1);
//        set1.removeAll(set2);
//        System.out.println(set1);

        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> copySet1 = new HashSet<>(set1);
        Set<T> copySet2 = new HashSet<>(set2);
        copySet1.removeAll(set2);
        copySet2.removeAll(set1);
        Set<T> sumySet = new HashSet<>(copySet1);
        for (T t : copySet2) {
            sumySet.add(t);
        }

        //твой код здесь
        return sumySet;
    }
}
   /* Реализуйте метод symmetricDifference, вычисляющий симметрическую разность двух множеств.
   Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

        Пример ввода: [1, 2, 3} и {0, 1, 2]
        Пример вывода: [0, 3]
        Требования:
        1. должен быть метод public static Set symmetricDifference(Set set1, Set set2)
        2. метод symmetricDifference не должен изменять исходные множества
        3. метод symmetricDifference должен возвращать корректный результат*/