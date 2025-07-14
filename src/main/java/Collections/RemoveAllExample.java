package Collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllExample {
    public static void main(String[] args) {
        // ������� ������ ���������
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");
        list1.add("date");
        System.out.println(list1);

        // ������� ������ ���������
        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("date");
        System.out.println(list2);

        // ������� �� list1 ��� ��������, ������� ���� � list2
        boolean isChanged = list1.removeAll(list2);
        System.out.println(list1);

        // ������� ���������
        System.out.println("���� �� ��������� ��������? " + isChanged);
        System.out.println("���������� �������� � list1: " + list1);
    }
}
