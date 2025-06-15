package Collections;

import java.util.Iterator;

public class MyIterable implements Iterable<Integer> {
    private Integer[] data = {1, 2, 3, 4, 5};

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public Integer next() {
                return data[index++];
            }
        };
    }

    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++);
        System.out.println(i);
        System.out.println("_________________");

        MyIterable myIterable = new MyIterable();

        for (Integer integer : myIterable) {
            if (integer % 2 == 0)
            System.out.println(integer);
        }
        System.out.println("_______________");

        Iterator<Integer> iterator = myIterable.iterator();  // Получаем итератор

        while (iterator.hasNext()) {
            System.out.println(iterator.next());  // Перебираем элементы
        }
    }
}
