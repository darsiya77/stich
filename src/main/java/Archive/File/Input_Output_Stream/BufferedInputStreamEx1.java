package Archive.File.Input_Output_Stream;
//https://metanit.com/java/tutorial/6.5.php

import java.io.*;

//Класс BufferedInputStream накапливает вводимые данные в специальном буфере без постоянного обращения к устройству ввода.

//BufferedInputStream(InputStream inputStream)
//BufferedInputStream(InputStream inputStream, int bufSize)

public class BufferedInputStreamEx1 {
    public static void main(String[] args) {

        String text = "Hello world!";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try (BufferedInputStream bis = new BufferedInputStream(in)) {

            int c;
            while ((c = bis.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
