package Archive.Generics.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Utility {
    // Статический обобщённый метод
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Вызов статического обобщённого метода с массивом типа Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        Utility.printArray(intArray);

        // Вызов статического обобщённого метода с массивом типа String
        String[] strArray = {"Hello", "World"};
        Utility.printArray(strArray);


        List list = new ArrayList(); // raw type
        list.add("Hello");
        list.add(42);

        String str = (String) list.get(0); // Это безопасно
        Integer num = (Integer) list.get(1); // Это приведет к ошибке во время выполнения

        System.out.println(str);
        System.out.println(num);

        List<? extends Number> list3 = new ArrayList<Integer>();
        Number number = list3.get(0);  // Всё в порядке, так как все элементы — это Number или его подтипы

        List<? super Integer> list2 = new ArrayList<Number>();
        list2.add(42);  // Всё в порядке, так как Integer является подтипом Number

        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue.remove());  // A
        System.out.println(queue.peek());    // B


    }



    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}