package Archive.File.File_Input_Output;
//https://metanit.com/java/tutorial/6.3.php

import java.io.FileOutputStream;
import java.io.IOException;

//запишем СТРОКУ в ФАЙЛ:

public class FileOutputStreamEx1 {
    public static void main(String[] args) {

        String text = "Hello world!"; // строка для записи
        String text2 = "\nAAAAAAA!"; // строка для записи

        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {

            // перевод строки в байты
            byte[] buffer = text.getBytes();
            byte[] buffer2 = text2.getBytes();


            fos.write(buffer, 0, buffer.length);                     //fos.write(buffer[0]); // запись первого байта
            fos.write(buffer2, 0, buffer2.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
