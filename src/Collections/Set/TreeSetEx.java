package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//��������� �������� ��������� �� ����������� (� �������� compare), ���� ��� ������ �������� ��������� ����������
//������� �� ��������� ��������� ������-������� ������
// ����� ���������� Set ���������� Map, �� ����� �� ��� ������ �����

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("text");
        set.add("a");
        set.add("text1");
        set.add("zxsds");
        set.add("134");
        for (String s : set) {
            System.out.println(s);
        }
        // �� ����� ����������� ����������. ���� ��������� � ������ User ����������, ��� ��  TreeSet ���� ��� �����������
        Set<User> setUser = new TreeSet<>();
    }
    class User {};
}
