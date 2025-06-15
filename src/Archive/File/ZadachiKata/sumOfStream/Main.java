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
            System.out.println("Ошибок нет!");
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
Напишите метод int sumOfStream(InputStream inputStream), который принимает InputStream и возвращает сумму
всех его элементов.
        Пример ввода: 1, 2, 4, 10
        Пример вывода: 17
        */
