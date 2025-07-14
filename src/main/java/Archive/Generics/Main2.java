package Archive.Generics;
//https://habr.com/ru/companies/sberbank/articles/416413/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
// Вот пример использования принципа подстановки в Java:
        Number n = Integer.valueOf(42);
        List<Number> aList = new ArrayList<>();
        Collection<Number> aCollection = aList;
        Iterable<Number> iterable = aCollection;

// «Дженерики» инвариантны. Приведем пример:
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
//        nums.add(3.14); // compile-time error
//  ==============================================================
        List<Integer> ints2 = Arrays.asList(1,2,3);
        List<Number> nums2;
//        nums2 = ints2; // compile-time error. Проблема обнаружилась на этапе компиляции
//        nums2.set(2, 3.14);
        System.out.println();
        assert ints2.toString().equals("[1, 2, 3.14]");

        Gen a = new Gen<Integer>(5);
        Gen<Integer> iOb;
        iOb = new Gen<Integer> (88);
        System.out.println(a.getOb());
        a.showType();
    }
    public static class Gen <T> {
        T ob;
        public Gen(T o) {
            this.ob = o;
        }

        public T getOb() {
            return ob;
        }
        void showType ( ) {
            System.out.println("Тип Т - это " + ob.getClass());
            System.out.println("Тип Т - это " + ob.getClass().getName());
        }
    }
}
