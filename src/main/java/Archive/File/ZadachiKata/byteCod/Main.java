package Archive.File.ZadachiKata.byteCod;

//https://www.youtube.com/watch?v=4MFcmreAUhs

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printUtf8Bytes('Ы'); // Пример вызова метода
        System.out.println("____________________________");

        //char[] buffer = new char[]{'ы'};
        print('Ы');
    }
//______________________________Метод 1___________________________________
    public static void printUtf8Bytes(char ch) {
        // Преобразуем символ в строку
        String str = String.valueOf(ch);

        // Получаем байты в кодировке UTF-8
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

        // Выводим десятичные беззнаковые значения байт через пробел
        for (byte b : bytes) {
            // Преобразуем байт в беззнаковое число (0-255)
            int unsignedByte = b & 0xFF;
            System.out.print(unsignedByte + " ");
        }
        System.out.println(); // Переход на новую строку
    }
//____________________________Метод 2 (с потоком)_____________________________________
    public static void print(char c) {
        // Преобразуем символ в строку
        String st = String.valueOf(c);
        // Получаем байты в кодировке UTF-8
        byte[] buffer = st.getBytes(StandardCharsets.UTF_8);
        int readByte;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {
        // Выводим десятичные беззнаковые значения байт через пробел, в методе read() уже зашито преобразование байт
        // в беззнаковое число (0-255). Русскоязычные буквы зашифрованы двумя байтами
            while ((readByte = bais.read()) != -1) {
                System.out.print(readByte + " ");
            }
        } catch (IOException e) {
            System.out.println("Олибка!");;
        }
    }
}

