package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://www.youtube.com/watch?v=l8-GAWo_528

// ключи уникальны, значения могут повторяться, если ключи повторяются, то значения перезаписываются
// Работа Hash таблиц (HashMap и HashSet) основана на корзинах. Хранит объект Nod - Дефолт знач. 16 - 2^4 и так далее
// Значения записываются не поп порядку

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("text", 5);
        map.put("text", 7);
        map.put("text1", 7);
        map.put(null, 7);
        System.out.println("_____");

        // (I)Entry - вложенный интерфейс в (I)Map, Entry - описывает пару <K, V>

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("__2___");

        // У Мэпы нет доступа к итератору, но через метод map.entrySet() мы можем вызвать итератор

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry);
        }
        System.out.println("___GET________");
        System.out.println(map.get("text1"));
    }
}
