package Archive.Generics.ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Capacity {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        try {
            // Получаем поле 'elementData' через рефлексию
            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true); // Делаем поле доступным
            Object[] elementData = (Object[]) field.get(list); // Получаем значение поля

            // Емкость массива равна длине массива elementData
            int capacity = elementData.length;
            System.out.println("Емкость: " + capacity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
