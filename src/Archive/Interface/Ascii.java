package Archive.Interface;

import java.util.Arrays;

public class Ascii {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("������������������ - " + answer.toString());//Hello!
        System.out.println("������ � - " + answer.length());//6
        System.out.println("������ ��� � 1 - " + answer.charAt(1));//e
        System.out.println("��������������������� - " + answer.subSequence(1, 5));//ello
        System.out.println("_________________________");
        String t = "text";
        System.out.println(t.length());
        System.out.println(example[0]);
    }
    public static class AsciiCharSequence implements CharSequence  {
        private byte[] byteSequence;

        AsciiCharSequence (byte[] byteArray) {
            this.byteSequence = byteArray;
        }

        @Override
        public int length() {
            return this.byteSequence.length;
        }

        @Override
        public char charAt(int index) {
            return (char) byteSequence[index];
        }

        @Override
        public AsciiCharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(this.byteSequence, start, end));

        }
        @Override
        public String toString() {
            String result = new String();
            for(int i = 0; i < this.length(); i++) {
                result += charAt(i);
            }
            return result;
        }
    }
}
/*
    �������� ����������� ����� AsciiCharSequence, ����������� ���������� �������� ������������������
    ASCII-�������� (�� ���� ������� � ���� ����) � ������� ����. �� ��������� � ������� String ��
    Java 8, �������� ������ ������ ��� char, AsciiCharSequence ����� �������� � ��� ���� ������ ������
        ����� AsciiCharSequence ������:

        ������������� ��������� java.lang.CharSequence;//+

        ����� �����������, ����������� ������ ����;//+

        ���������� ������ length(), charAt(), subSequence() � toString()

        ��������� ������� � �������� �� �� ��������� �������� � �������� ����������
        java.lang.CharSequence
        (JavaDoc ��� ���������). � ������ ������� ������� charAt() � subSequence() ������ �����
        ����������
        ���������� ������� ���������, ������� �� ��������� � ���������� ������ ���������� �� �����.
        ��� ����� �� ��� �� ��������� ����������.*/
