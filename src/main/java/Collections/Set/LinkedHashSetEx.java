package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// ����� ���������� Set ���������� Map, �� ����� �� ��� ������ �����
//  ������ �������� (�� �������) � ��� �������, � ���. �� ���������, �� ��������� �� ����� ������ ��� HashSet
//  ���������� ������� ������ ��� �������������� ���������

public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("text");
        set.add("ab");
        set.add("ac");
        set.add("text2");
        set.add("text1");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
