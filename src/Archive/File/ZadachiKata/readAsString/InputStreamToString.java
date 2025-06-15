package Archive.File.ZadachiKata.readAsString;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamToString {

    /**
     * ����� ��� ������ ������ �� InputStream � �������������� �� � ������.
     *
     * @param inputStream ������� ����� ������.
     * @param charsetName �������� ��������� (��������, "UTF-8").
     * @return ������, ����������� �� ������.
     * @throws IOException ���� ��������� ������ �����-������.
     */
    public static String convertInputStreamToString(InputStream inputStream, String charsetName) throws IOException {
        // ������� ByteArrayOutputStream ��� ���������� ������
        ByteArrayOutputStream result = new ByteArrayOutputStream();

        // ����� ��� ������ ������
        byte[] buffer = new byte[1024];
        int length;

        // ������ ������ �� InputStream � ���������� �� � ByteArrayOutputStream
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }

        // ����������� ����� � ������ � �������������� ��������� ���������
        return result.toString(charsetName);
    }

    public static void main(String[] args) {
        // ������ �������������
        try (InputStream inputStream = InputStreamToString.class.getResourceAsStream("/example.txt")) {
            if (inputStream != null) {
                String content = convertInputStreamToString(inputStream, "UTF-8");
                System.out.println(content);
            } else {
                System.out.println("���� �� ������");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}