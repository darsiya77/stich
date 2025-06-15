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

/*    ��������� ���������� BiPredicate<Integer, String> ���������� �������� �� Map<Integer, String>
        ���� ��� ����-�������� ��� ������� ������ ������ �������� �� ����� ����� ����� ��������.
        �������� ����� ���� ��� {3: �Hello�} ������ ���� ������� ��� ��� ������ �Hello� �� ����� 3, �
        ���� ���� {4: �Java�} ���������.*/
