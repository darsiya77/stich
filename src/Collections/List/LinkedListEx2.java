package Collections.List;

import java.util.LinkedList;
import java.util.List;

/*
ArrayList ������� ��� LinkedList ��� ���������� ������ .get()
LinkedList                    ������ ����� ������� ��� �������� ���, ���� ����. �� 5-� ������� ���� ������ ������ � 6 � 4 ��.
       [] {-[]-} {-[]-} []
        |   |            |
     first Node        last
*/
public class LinkedListEx2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);                              // array[0] = 5
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        list.add(7);                              // array[1] = 7
        System.out.println("list.size = " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i): " + list.get(i));
        }
    }
}
