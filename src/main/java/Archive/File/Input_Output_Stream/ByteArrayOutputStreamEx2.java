package Archive.File.Input_Output_Stream;

import java.io.*;
// https://metanit.com/java/tutorial/6.4.php

/* Классы ByteArrayInputStream и ByteArrayOutputStream. Класс ByteArrayInputStream представляет ВХОДНОЙ поток,
использующий в качестве источника данных массив байтов. Он имеет следующие конструкторы:

                                                        ByteArrayInputStream(byte[] buf);
                                                        ByteArrayInputStream(byte[] buf, int offset, int length)

======================================================
В отличие от других классов потоков для закрытия объекта ByteArrayInputStream НЕ ТРЕБУЕТ вызывать метод CLOSE.
Считаем массив байтов и выведем его на экран:
===============================================================================================================
===============================  Чтение массива байтов и класс ByteArrayInputStream  ===========================
*/
public class ByteArrayOutputStreamEx2 {
    public static void main(String[] args) {

        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {

            System.out.print(b); // печатает элементы массива array1{1, 3, 5, 7};
        }
        System.out.println();

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {

            System.out.print((char) c);
        }
        System.out.println("\n");

/*===============================  Запись массива байт и класс ByteArrayOutputStream  ===========================

Класс ByteArrayOutputStream представляет поток ВЫВОДА, использующий массив байтов в качестве места вывода.
Чтобы создать объект данного класса, мы можем использовать один из его конструкторов:

        ByteArrayOutputStream() - создает массив для хранения байтов длиной в 32 байта
        ByteArrayOutputStream(int size) - создает массив длиной size.
*/
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text2 = "Hello Wolrd!";
        byte[] buffer2 = text2.getBytes();
        try {
            baos.write(buffer2);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
                                                               // превращаем массив байтов в строку
        System.out.println(baos.toString());                   // Hello Wolrd!

                                                               // получаем массив байтов и выводим по символьно
        byte[] array = baos.toByteArray();
        for (byte b2 : array) {

            System.out.print((char) b2);
        }                                                      // Hello Wolrd!
        System.out.println();

/*С помощью метода writeTo мы можем вывести массив байт в другой поток. Данный метод в качестве параметра принимает
объект OutputStream, в который производится запись массива байт:
*/
        ByteArrayOutputStream baos3 = new ByteArrayOutputStream();
        String text3 = "Hello Wolrd!";
        byte[] buffer3 = text3.getBytes();
        try {
            baos3.write(buffer3);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("hello.txt")) {

            baos3.writeTo(fos);
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}

