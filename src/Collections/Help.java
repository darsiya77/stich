package Collections;

import java.util.*;

/*
                            JavaCollectionFramework
                            ______ Iterable (I)_________________
                            |                                   |
                       ____Collection (I)________________       |
                      /               |                  |      |
                  List (I)          __Set___              Queue     Map <����, ��������>
                / /                 |   |  |                     |
           ArrayList (Class)   HashSet  |  TreeSet               HashMap
                                        LinkedHashSet

ArrayList ������� ��� LinkedList ��� ���������� ������ .get()

 */
public class Help {
    public static void main(String[] args) {
        int[] arr = new int[4];  // �������� ����������� ������
        String[] arrStr = new String[7];
        arrStr[0] = "str";

//         � ���������� ������ ��������� ���������� �����������


//         � List �������� ��������� ����� �����������. �������� ��������� ����������� �� �������
        List<String> list = new ArrayList<>();
        list.add("str");
        list.add("str");
        list.add("str1");
        System.out.println("List: " + list);            // List: [str, str, str1]

//        � Set �������� ������ ���������� ��������
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(-2);
        set.add(-100);
        set.add(10);
        set.add(-3);
        set.add(5);
        set.add(-1);

        System.out.println("Set: " + set);             // Set: [1, 2]

//        � Map �������� �������� � ���� (����, ��������)

        Map<Integer, String> map = new HashMap<>();    // Map: {1=str, 2=str, 3=str}
        map.put(1, "str");
        map.put(2, "str");
        map.put(3, "str");
        map.put(3, "str");
        System.out.println("Map: " + map);
    }
}
