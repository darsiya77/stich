package Archive.File.ZadachiKata;

import java.io.*;
import java.util.Arrays;

public class PrintEx {
    public static void main(String[] args) throws IOException {

        String str = "Hello";   // [72 101 108 108 111]
        ByteArrayInputStream byteStreamIn = new ByteArrayInputStream(str.getBytes());   // [72 101 108 108 111]
        ByteArrayOutputStream byteStreamOut = new ByteArrayOutputStream();
        FileOutputStream fos = new FileOutputStream("byteStreamOut.txt");


        System.out.println(new String(str.getBytes(), 0, str.getBytes().length));

        print(byteStreamIn, byteStreamOut);


        System.out.println(byteStreamOut);
        System.out.println(Arrays.toString(byteStreamOut.toByteArray()));

        byteStreamOut.writeTo(fos);
        System.out.printf("\"%s\" is written to the \"%s\" file", byteStreamOut, "byteStreamOut.txt");

    }
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int buff;
        while ((buff = inputStream.read()) != -1) {
            if ((buff % 2) == 0) {
                outputStream.write(buff);
            }
            outputStream.flush();

        }
    }
}
/*
    Напишите метод void print(InputStream inputStream, OutputStream outputStream) который принимает InputStream
    и OutputStream, считывает все байты из inputStream и записывает в OutputStream только четные.

        Пример ввода: 3, 10, 4, 5, 7

        Пример вывода: 10, 4



        Требования:

        1. Метод должен быть публичным.

        2. Параметры должны иметь тип InputStream inputStream и OutputStream outputStream.

        3. Сигнатура метода должна быть: print(InputStream inputStream, OutputStream outputStream)*/
