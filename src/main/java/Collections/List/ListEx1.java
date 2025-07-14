package Collections.List;

import java.util.ArrayList;
import java.util.List;


//� List �������� ��������� ����� �����������
//�������� ��������� ����������� �� �������

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();    // ArrayList<>() - ���� �� ���������� ���������� List
        list.add(5);   // 0[5]
        list.add(7);   // 1[7]
        list.add(1, 9);   // 1[9], 7 ���������� �� 2[7]
        list.set(1, 2);   // 1[2] - ����������
        System.out.println("list.get(1): " + list.get(1));
        System.out.println("list.size = " + list.size());
        System.out.println("_________");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i): " + list.get(i));
            System.out.println("______");
            System.out.println(list);
        }
        System.out.println("______OF______");
        List<String> sL = List.of("����", "����", "����", "���");
        List<Integer> lis = new ArrayList<>();
        lis = List.of(1,2,3,4);
        ArrayList<Integer> ar = new ArrayList(lis);
        ar.add(7);
        System.out.println(lis);
        System.out.println(sL);
        System.out.println(ar);
    }
}

//ArrayList<>() - ������������ ������, ����� ���������� � �������� ���������� ���������. ������ �������� = 10.

//����� list.add() - ��������� ������� �� ��������� ��������� ������
//list.add(1, 2) - ������ �������, ��������, �� i ������ ������ � �������, � ������� �������� �������� ������
//list.set(1, 2) - �������������� ������� �� �������� ������
//list.get(1) - ��������� �������� �� �������