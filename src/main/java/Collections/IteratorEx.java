package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");
        System.out.println("List: " + list);            // List: [str, str, str1]

      /*  Iterator<String> iterator = list.iterator();  // ��� �� ������� iterator ��������� (����� Map) - .iterator()
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            */

            // List.of - ����.����� ��� ���������� ��������� ������ ������ List.add
            List<String> names = List.of("John", "Sara", "Jack");
            for (Iterator i = names.iterator(); i.hasNext(); ) {
                String name = (String) i.next();
                System.out.println("Name = " + name);
            }
        System.out.println("____________");
        for (String s : names) {  // iter - ����� �� �������
            System.out.println(s);
        }
//        � ��������� Set ��� ������ .get � �� ����� ��� ��������� iterator - �� ���� � ��������� Set � ������ ����������
//        � ��������� ���������

    }
}
