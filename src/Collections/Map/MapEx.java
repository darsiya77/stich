package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://www.youtube.com/watch?v=l8-GAWo_528

// ����� ���������, �������� ����� �����������, ���� ����� �����������, �� �������� ����������������
// ������ Hash ������ (HashMap � HashSet) �������� �� ��������. ������ ������ Nod - ������ ����. 16 - 2^4 � ��� �����
// �������� ������������ �� ��� �������

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("text", 5);
        map.put("text", 7);
        map.put("text1", 7);
        map.put(null, 7);
        System.out.println("_____");

        // (I)Entry - ��������� ��������� � (I)Map, Entry - ��������� ���� <K, V>

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("__2___");

        // � ���� ��� ������� � ���������, �� ����� ����� map.entrySet() �� ����� ������� ��������

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry);
        }
        System.out.println("___GET________");
        System.out.println(map.get("text1"));
    }
}
