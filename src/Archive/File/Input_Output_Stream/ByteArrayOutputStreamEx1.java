package Archive.File.Input_Output_Stream;
//https://metanit.com/java/tutorial/6.4.php
import java.io.*;

//конструкторы:
//ByteArrayOutputStream()               -      создает массив для хранения байтов длиной в 32 байта
//ByteArrayOutputStream(int size)       -      создает массив длиной size


public class ByteArrayOutputStreamEx1 {
    public static void main(String[] args) {

        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        String text1 = "Hello Wolrd!";
        byte[] buffer1 = text1.getBytes();
//        System.out.println(Arrays.toString(buffer1));
        try {
            baos1.write(buffer1);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        // превращаем массив байтов в строку
        System.out.println(baos1);

        // получаем массив байтов и выводим по символьно
        byte[] array = baos1.toByteArray();
        for (byte b : array) {

            System.out.print(b + " ");
        }
        System.out.println();

// Используя методы toString() и toByteArray(), можно получить массив байтов buf в виде текста или непосредственно в виде массива байт.

// С помощью метода writeTo мы можем вывести массив байт в другой поток. Данный метод в качестве параметра принимает
// объект OutputStream, в который производится запись массива байт:

        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        String text2 = "Hello Wolrd!";
        byte[] buffer = text2.getBytes();
        try {
            baos2.write(buffer);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("hello.txt")) {

            baos2.writeTo(fos);
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
        System.out.println("\"Hello Wolrd!\" is written to the \"hello.txt\" file");
    }
}
