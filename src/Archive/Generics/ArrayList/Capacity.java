package Archive.Generics.ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Capacity {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        try {
            // �������� ���� 'elementData' ����� ���������
            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true); // ������ ���� ���������
            Object[] elementData = (Object[]) field.get(list); // �������� �������� ����

            // ������� ������� ����� ����� ������� elementData
            int capacity = elementData.length;
            System.out.println("�������: " + capacity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
