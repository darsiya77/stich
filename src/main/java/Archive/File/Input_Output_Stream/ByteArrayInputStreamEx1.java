package Archive.File.Input_Output_Stream;

//https://metanit.com/java/tutorial/6.4.php

import java.io.*;

//Для работы с массивами байтов - их чтения и записи используются классы ByteArrayInputStream и ByteArrayOutputStream.
//Класс ByteArrayInputStream представляет входной поток, использующий в качестве источника данных массив байтов.

public class ByteArrayInputStreamEx1 {
    public static void main(String[] args) {

        byte[] array1 = new byte[]{72, 101, 108, 108, 111};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {

            System.out.println(b);
        }

        System.out.println("====================");

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {

            System.out.println((char) c);
//В отличие от других классов потоков для закрытия объекта ByteArrayInputStream не требуется вызывать метод close.
        }
    }
}
