package Archive.File.ZadachiKata.sumOfStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        byte[] array1 = new byte[]{1, 2, 4, 10};
        Main m = new Main();
        try (ByteArrayInputStream byteStream = new ByteArrayInputStream(array1)) {
            System.out.println(m.sumOfStream(byteStream));
        } catch (IOException e) {
            System.out.println("������ ���!");
        }
        System.out.println(0xff);
    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int n;
        int sum = 0;
        while ((n = inputStream.read()) != -1) {
            sum += (byte) n;
        }
        return sum;
    }
}
/*
�������� ����� int sumOfStream(InputStream inputStream), ������� ��������� InputStream � ���������� �����
���� ��� ���������.
        ������ �����: 1, 2, 4, 10
        ������ ������: 17
        */
