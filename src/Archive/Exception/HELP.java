package Archive.Exception;

import java.io.IOException;

// https://youtu.be/RXfurmtlANg?si=54Zw4wkQx2Q8gvbg https://youtu.be/_3K2Q4K08hQ?si=nHLKnwCFunabufkf
// Ctrl + N (�����, �����)
// Ctrl + O (�������� �����������)
// Alt + Ins (�������� �����������)
// Ctrl + F12 (����������� ������ ������, ��������� ������)
// Shift ������� - �����
// Alt+7 - ���������� ������
// Ctrl+H - ��� ����������
/*
                        Throwable  (checked)
                      /                     \
                  Error (checked)    Exception (checked)
                / /  \ \              / /  \ \
 OutOfMemoryError           IOException      RuntimeException (unchecked)
                          (checked) |           |
                  FileNotFoundException      NullPointerException,
                                             IndexOutOfBoundsException,
                                             ArithmeticException,
                                             IllegalArgumentException

checked - ������ ������� ������� �� ���������� (throws + throw, try\catch)
throws - ������������ �����������, �����������, ���� ��� �������� �� ��������� ���������� � �������.
throws - ���������� ��������� ���������� � ������ ������

throw - ������������, ��� �� ��������� ���������� � ����� ���������

unchecked - �� ���������� ��� ������ ������� �� ����������. �� ��������� �� ���������� ������������
��� ������ ������������ unchecked ����������

Error - checked ����������, �� ��� ���� ����������� �������������� - ��� �� ��������������, �� ������ ��������
�� ��� �������� checked - �.�. ���� ��� ����������, �� ��������� 100% ����������

����� ���������� ���������� ������� �������� �� ����� ���������
*/
public class HELP {
    public static void main(String[] args) throws RuntimeException, IOException, OutOfMemoryError {
        System.out.println("������ ��� ����");
        System.out.println("Hello, world");
    }
}
