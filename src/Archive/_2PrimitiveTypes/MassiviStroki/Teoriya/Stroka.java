package Archive._2PrimitiveTypes.MassiviStroki.Teoriya;

import java.util.Arrays;

public class Stroka {
    public static void main(String[] args) {
        String hello = "Hello\"";
        String specialChars = "r\n\t\"\\";   //  \n - enter, \t - tab, \" - ������� ("), \\ - ���� (\)
        String empty = "";
        System.out.println(hello);
        System.out.println(specialChars);
        System.out.print(empty);
        System.out.println("");
        System.out.println("______________2___________________");

        char [] charArray = {'a','b','c'};
        System.out.println(Arrays.toString(charArray)); // [a, b, c] - ����� �������� ������ ������� Arrays.toString() ������ Arrays

        String string = new String(charArray);    // ������� ������ string ������ String � � ������� ������������
                                                  // String(charArray) ����� ������������ ����������� ����� ������ �������� charArray
                                                  // � ������ ��������. new - ����� �������� �������� ������� string.
        System.out.println(string);               // abc - ������������� ������ string, ���. ������ ��� ��������. �� �������
        System.out.println("___________3___________");

        char[]KakoyToMassiv = new char[3]; // ��� � ��� �������, ���� �� ������ ������� �����-�� ������ - ��� ��� ���������
        System.out.println(Arrays.toString(KakoyToMassiv)); // ������� � ������� [0,0,0] ��������� ������� 0

        char[]charsFromString = string.toCharArray(); // ���������� string, ������� ����� ����������� ��� ������ ������
                                                      // String ��������� � ���� ������ String � ������ � ������
                                                      // toCharArray, ������� ��������� ������ � ������ ��������,
                                                      // �.�. ������� � ������ charsFromString ������ ������ string,
                                                      // ������� ������������ �� ���� ������� abc � ��� ����������
                                                      // ���������� ������� charsFromString

                                                      // Arrays.toString() - ����� ��� ������ �� ������ �������
        System.out.println(Arrays.toString(charsFromString)); // [a, b, c]
        String s = new String(); // ���������� s ���������� �������� s ������ ������, �� ��� ������ ������ ��� ������
                                 // �� ����������� - ����� ������ ����� ��������� �������� ���������� ������ String
        s = "������";
        String a = "��� ����?";  // ��������, ��� ����� - ���������� � ����� ������� � ���� �������� "��� ����?"

        String b = new String(KakoyToMassiv);          // ��� ������� ������ ����������� � ������ ������ "�������������"
                                                       // ������� ��������� ������� 000
        System.out.println(b);

        char[]aa = a.toCharArray();                     // ������������ ������ "�" (��� ����?) � ������ ��������
        System.out.println(Arrays.toString(aa));        // [�, �, �,  , �, �, �, �, ?]
        System.out.println("___________________4_____________________________");
        int lengthStroki = a.length();
        System.out.println(lengthStroki);               // 9 - ����� �� ������ ����� ������ "�" (��� ����?)
        char firstChar = a.charAt(0);                   // (char firstChar = '�') - �������� ������ ������ �� �������,
                                                        // �������� ��� ���������� ���� char
        System.out.println(firstChar);                  // K - ������� � ������� ����.�����. firstChar (=0-� ������ ������ �)
        System.out.println(a.charAt(8));                // ? - ����� ������� � ������� ��������� (8-q) ������ ������ �.
        System.out.println(a.endsWith("��?"));          // true - �������� �� ������ ������������ ���������
        System.out.println(a.endsWith("��"));           // false - �������� �� ������ ������������ ���������
        System.out.println(a.contains("� ���"));       // true - �������� �� ������ ������������ ���������

    }
}
