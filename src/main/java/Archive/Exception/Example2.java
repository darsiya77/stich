package Archive.Exception;

import java.util.Stack;

public class Example2 {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("1");
        strings.push("2");

        //System.out.println(strings.peek());
        //System.out.println(strings.peek());

        // ����� .peek ������� ������� � �������� ������ �����

        System.out.println(strings.pop());
        System.out.println(strings.pop());
        System.out.println(strings.pop());

        // ����� .pop ������� ������� � �������� ����� � ������� ���
    }
}
