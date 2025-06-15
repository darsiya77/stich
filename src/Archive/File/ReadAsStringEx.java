package Archive.File;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ReadAsStringEx {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream reader = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(reader, StandardCharsets.US_ASCII));

//        FileInputStream reader2 = new FileInputStream("notes.txt");
//        System.out.println(readAsString(reader2, StandardCharsets.US_ASCII));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader st = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        int a;
        while ((a = st.read()) != -1) {
            sb.append((char) a);
        }
        return sb.toString();
    }
}
/*      ���������� �����, ������� �������� ������ �� InputStream � ����������� �� � ������, ��������� �������� ���������.
        ������:
        InputStream ��������������� ���������� ������ �����: 48 49 50 51.
        �����, ��������� ��� ������ InputStream � ��������� ASCII, ������ ������� ������: "0123".
*/