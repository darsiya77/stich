package Archive.File.Main;
//https://www.youtube.com/watch?v=PZa7LEY_7LM
//https://youtu.be/4MFcmreAUhs?si=ZzFmXhVNHadRuENf
//https://symbl.cc/en/042B/

// ��� ������� '�' (UTF-8)    --> D0 AB (hex) --> 53419 (dec) --> 208 171 dec (bytes) -->11010000 10101011 (binary)
// ��� ������� '�' (UTF-16BE) --> 04 2B (hex) --> 1067 (dec)  -->   4 43  dec (bytes) -->00000100 00101011 (binary)
// ��� ������� '�' (UTF-32BE) --> 00 00 04 2B (hex) --> 1067 (dec) --> 0 0 4 43 dec (bytes)-->00000000 00000000 00000100 00101011 (binary)
//����� .read() � ������ InputStreamReader ������������� � ������ �� (� ������� �� System.in.read()) ��������� �� �����,
// � �������

import java.io.IOException;
import java.io.InputStreamReader;             // - ���� ����� ������ ���������
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException {


        String hex = "D0AB";
        int decimal = Integer.parseInt(hex, 16);

        System.out.println(decimal); // 53419
        System.out.println((byte)decimal);
        System.out.println(decimal & 0xff);

        byte[] byteArray = "�".getBytes();
        System.out.println(Arrays.toString(byteArray));
//        System.out.println((int)'�');        // 1067
//        System.out.println((int)'S');        // 83
//        System.out.println((int)'H');        // 72

        InputStreamReader InputSymbols = new InputStreamReader(System.in);
//        while (true) {
//            int SymbolIn = InputSymbols.read();              // ��� '�' ������� 1067, 'S' - 83, 'H' - 72
//            System.out.println(SymbolIn);
//
//        }
    }
}
