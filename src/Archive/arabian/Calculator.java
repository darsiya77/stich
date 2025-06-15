package Archive.arabian;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Converter converter = new Converter();

        String[] actions = {"+", "-", "/", "*"};
        String[] regexAction = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in); // System.in - ����������� �������, ��� �� ������ ����� ������� ������
        System.out.println("������� ���������: ");
        String exp = scn.nextLine(); // ������� 'exp' �� ��, ��� ����� �������� � ���������� ������� 'nextLine()'

        // ���������� �������������� ��������:

        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
        // ���� �� ����� �������������� ��������, ��������� ���������:

        if (actionIndex == -1) {
            System.out.println("������������ ���������");
            return; // return - ��������� ������ ������ 'main'
        }
        //����� ������� �� ���������� ��������������� �����. (2+4.split(+) -> {"2", "4"})

        String[] data = exp.split(regexAction[actionIndex]);

        //����������, ��������� �� ����� � ����� ������� (��� ������� ��� ��� ��������)

        if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {
            int a, b;
            // ���������� ������� �� ��� �����
            boolean isRoman = converter.isRoman(data[0]);
            if (isRoman) {
                a = converter.romanToInt(data[0]);
                b = converter.romanToInt(data[1]);
                if (a > 10 || b > 10) {
                    System.out.println("������������ ���������");
                    return;
                }
            } else {
                // ���� ��������, ������������ �� �� ������ � �����
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);
                if (a > 10 || b > 10) {
                    System.out.println("������������ ���������");
                    return;
                }
            }
            //��������� � ������� �������������� ��������
            int result = 0;
            switch (actions[actionIndex]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "/":
                    result = a / b;
                    break;
                case "*":
                    result = a * b;
                    break;
            }
            if (isRoman) {
                // ���� ����� ���� �������, ���������� ��������� � ������� �����
                System.out.println(converter.intToRoman(result));
            } else {
                //���� ����� ���� ��������, ���������� ��������� � �������� �����
                System.out.println(result);
            }
        } else {
            System.out.println("����� ������ ���� � ����� �������");
        }

    }
}