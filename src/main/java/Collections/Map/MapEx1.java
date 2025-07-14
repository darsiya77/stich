package Collections.Map;

import java.util.HashMap;
import java.util.Map;


//  0[16] 1[17] 2[] 3[19-text3] 4[4] 5[] 6[] 7[] 8[] 9[] 10[] 11[] 12[] 13[] 14[] 15[] 16[] - 16 ������
//  ������ = ������� �� - hashCode ����� / ���-�� �����. 17 % 16 = 1
//  � ������ ��������, ����� ������� ���� ������, �� ��� ��������� �������� ����� ���� ���� �� � ���� � �� �� ������
//  ��������� 2 ���� - 1[17-text2, 33-text3] (� ������ ����� ������ ����), ���� ��� �� ���� ����������

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(19, "text1");
        map.put(17, "text2");
        map.put(4, "text3");
        map.put(19, "text3");
        map.put(33, "text3");
        map.put(16, "text2");
        map.put(18, "text2");
        map.put(null, "text3");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("___________");
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));

        System.out.println();
    }
}
