import java.math.BigInteger;

public class MaxLongKvadrat {
    public static void maxLongSqr() {
        BigInteger num = new BigInteger(String.valueOf(Long.MAX_VALUE));
        System.out.println(num.pow(2));
        System.out.println((new BigInteger(String.valueOf(Long.MAX_VALUE)).pow(2)));
    }

    // �.�. BigInteger - �������� � ���� � ��� ���� ���������� � ��������� ������� - "2" �� ���������� String.valueOf �����
    // String.valueOf - https://www.youtube.com/watch?v=I0ypcMnwi_M
    // MAX_VALUE - ����� ������������� �������� � ������� int, byte, double � ������
    public static void main(String[] args) {
        maxLongSqr();
    }
}
/* ����������� �����, ������� ������� �� ����� ������� ������������� ��������, ������� ����� ����������� � ����������
long. ����� ��� �������� ����������, ���������� ������������ ����� BigInteger

64 ��� �������� �� -2^63 �� + 2^63-1
(-9_223_372_036_854_775_808 �� +9_223_372_036_854_775_807)
*/
