package Archive.Generics.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        System.out.println("java.util.ArrayList<E> Example ");
        ArrayList<String>  listA = new ArrayList<>();

        //---------------------------------
        System.out.println("����������: ");

        // ������������� ������� �������, ��� �������� ��������� ���������� ��������� ��� ���������
        // ����������� ������� ��� �������� ������ � ������.
        listA.ensureCapacity(10);

        listA.add("a0");
        listA.add("a1");
        System.out.println("- � ����� listA.add(): " + listA);

        listA.add(1, "a2");
        System.out.println("- �� ������� listA.add(1, \"a2\"): " + listA);

        //---------------------------------
        System.out.println("��������� ��������� � ����������: ");

        System.out.print("- ������� �������� (for each): ");
        for (String el:listA){
            System.out.print(el+" ");
        }
        System.out.println();

        System.out.println("- �������� �� ������� listA.get(1): " + listA.get(1));

        System.out.println("- ������ listA.size(): " + listA.size());

        //---------------------------------
        System.out.println("���������: ");

        listA.set(1, "c1");
        System.out.println("- �� ������� listA.set(1, \"c1\"): " + listA);

        // ��������� ������� ���������� ������� �� ��� �������� �������
        listA.trimToSize();

        //---------------------------------
        System.out.println("��������: ");

        listA.remove(1);
        System.out.println("- �� �������: " + listA);


    }
}
