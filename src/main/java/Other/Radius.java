package Other;

public class Radius {
public static void calcCircleRadius(double area) {
    System.out.printf("%.3f", Math.sqrt(area / Math.PI));
    // printf - ����� �������������� ������
    // %.3f - "%" - ������� ������ ��������, ������� ������ �����, ".3" - 3 ����� ����� ������� "f" - ������������ �����
}

// aria = Pi r2, R = ������ �� (aria/pi)
public static void main(String[] args) {
    calcCircleRadius(123);
}
}
// 1. �������� ��� � IDEA � ���  Ctrl + Alt + L
//2. �������� Shift + Tab
//3. �������� � ��������� �� ����