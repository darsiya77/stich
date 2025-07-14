package Archive.File.Input_Output_Stream;
//https://metanit.com/java/tutorial/6.5.php

import java.io.*;

//BufferedOutputStream(OutputStream outputStream)
//BufferedOutputStream(OutputStream outputStream, int bufSize)

public class BufferedOutputStreamEx1 {
    public static void main(String[] args) {

        String text = "Hello world!"; // строка для записи
        try (FileOutputStream out = new FileOutputStream("notes.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("DONE!");
    }
//    BufferedOutputStream не добавляет много новой функциональности, он просто оптимизирует действие потока вывода.
}
