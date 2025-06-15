package Archive.File.ZadachiKata;

import java.io.*;

public class SumOfStreamEx {
    public static void main(String[] args) throws IOException {
// Записываем в файл hello.txt слово "Hello "
        String str = "Hello ";
        try (FileWriter writer = new FileWriter("hello.txt")){
            writer.write(str);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("The word \"%s\" was written to the \"hello.txt\" file \n", str);
//        -----------------------------------------------------------------------
// Создаем поток ввода byteStream с источником массив байтов и применяем метод sumOfStream
        ByteArrayInputStream byteStream = new ByteArrayInputStream (new byte[]{1, 2, 4});
        int byteArrayInputStream = sumOfStream(byteStream);

        System.out.println("int byteArrayInputStream = sumOfStream(byteStream): " + byteArrayInputStream);
//        ______________________________________________________________________________
// Создаем поток ввода fin с источником - файл hello.txt и применяем метод sumOfStream
        FileInputStream fin = new FileInputStream( "hello.txt");       // FileInputStream - для считывания данных


        int fileInputStream = sumOfStream(fin);
        System.out.println("int fileInputStream = sumOfStream(fin): " + fileInputStream);

        System.out.println("__________________________");
        byte x = 127;
        int y = 200;
        System.out.println((int)x);
        System.out.println((byte)y);
    }
    public static int sumOfStream(InputStream inputStream) throws IOException {
        int buff;
        int result = 0;
        while ((buff = inputStream.read()) != -1) {
            result += (byte) buff;
        }
        return result;

    }
}

//    Напишите метод int sumOfStream(InputStream inputStream), который принимает InputStream и возвращает сумму всех его элементов.
//    Пример ввода: 1, 2, 4, 10
//    Пример вывода: 17

// Логика: мой метод принимает разновидность InputStream, в котором введены данные - 1,2,4,10