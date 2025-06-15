package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set ������ ������ ���������� �������� � ������ �� � ������� ����������. ��� Map �� ������ ������ �����
// � ���������� Set ������������ �� ������� ������� � Hash ����. ��� �������� ������ (��� �������� ���������)
// ����� ���������� Set ���������� Map, �� ����� �� ��� ������ �����

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("text");
        set.add("text1");
        set.add("text1");
        set.add("text2");
        set.add("text2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("_____");
        /*while (set.iterator().hasNext()) {
            String s = set.iterator().next();
            System.out.println(s);
        }*/

        for (String s : set) {
            System.out.println(s);
        }
    }
}
