package Archive.FunctionalProgramming.KataEx.Ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class BufRead {
    public static void main(String[] args) throws IOException {

        // ������ BufferedReader (����� �������� �� ������ �� ����� ��� ������� ���������)

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));

        // �������������� BufferedReader � ����� ����
        Stream<String> wordStream = reader.lines()                    // �������� ����� �����
                .flatMap(line -> Arrays.stream(line.split("\\s+")))   // ��������� ������ ������ �� �����
                .filter(word -> !word.isEmpty());                     // ���������� ������ ������

        // ������ ������������� ������
        wordStream.forEach(System.out::println);

        // ��������� BufferedReader (����� ��� �������� ������!)
        reader.close();
    }
}
