package Archive.File;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintStreamEx3 {
    public static void main(String[] args) {

        System.out.println("Hello"); // ����� ������ �� �������

// ��������� ����� ������ �� ������� � ��������� ����������. ������� � ����� ������.

        PrintStream console = System.out;
        console.println("Hello");

//        ������� ������������ (���������������) ������ ���� � ������.
//        ������� ��� � ����� ������� ������ � �������� PrintStream
//        ������� � ����� ������.

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream console2 = new PrintStream(stream);
        console2.println("Hello");
        System.out.println(stream);
    }
}
