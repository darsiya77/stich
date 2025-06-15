package Archive.FunctionalProgramming.Predicate.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class MainHW4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Hello");   // 5
        map.put(2, "Hi");      // 2
        map.put(14, "Chao");    // 4
        map.put(17, "Morning"); // 7
        map.put(3, "Hei");     // 3

        BiPredicate<Integer, String> filter = (key, value) -> key != value.length();

        map.entrySet().removeIf(m -> filter.test(m.getKey(), m.getValue()));
        System.out.println(map);
    }


}

/*    Используя реализацию BiPredicate<Integer, String> реализуйте удаление из Map<Integer, String>
        всех пар ключ-значение для которых длинна строки значения не равна ключу этого значения.
        Например такая пара как {3: «Hello»} должна быть удалена так как длинна «Hello» не равна 3, а
        пара вида {4: «Java»} останется.*/
