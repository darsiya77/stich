package Archive.arabian1;

import java.util.Map;
import java.util.Scanner;

public class CalculatorArabian1 {
    public static void main(String[] args) {
        //2+3
        //V-VII
        Converter1 converter = new Converter1();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        System.out.print("������� ���������: ");
        String exp = scn.nextLine();
        //���������� �������������� ��������:
        int actionIndex=-1;
        for (int i = 0; i < actions.length; i++) {
            if(exp.contains(actions[i])){
                actionIndex = i;
                break;
            }
        }
        //���� �� ����� ��������������� ��������, ��������� ���������
        if(actionIndex == -1){
            System.out.println("������������ ���������");
            return;
        }
        Map<Character, Integer> arabianMap = Converter1.romanKeyMap;
        //"2-4".split("-")-> {"2", "4"}
        String[] data = exp.split(regexActions[actionIndex]);
        //����������, ��������� �� ����� � ����� ������� (��� ������� ��� ��� ��������)
        if(converter.isRoman(data[0]) == converter.isRoman(data[1])){
            int a,b;

            //������������ �������� ����� �� ������ � �����
            a = arabianMap.get(data[0].charAt(0));
            b = arabianMap.get(data[1].charAt(0));

            //��������� � ������� �������������� ��������
            int result;
            switch (actions[actionIndex]){
                case "+":
                    result = a+b;
                    break;
                case "-":
                    result = a-b;
                    break;
                case "*":
                    result = a*b;
                    break;
                default:
                    result = a/b;
                    break;
            }
            //���� ����� ���� ��������, ���������� ��������� � �������� �����
            System.out.println(result);

        } else {
            System.out.println("����� ������ ���� � ����� �������");
        }


    }
}