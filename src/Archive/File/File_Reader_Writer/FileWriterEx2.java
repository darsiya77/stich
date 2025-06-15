package Archive.File.File_Reader_Writer;

import java.io.*;

//https://metanit.com/java/tutorial/6.8.php
//https://www.youtube.com/watch?v=n7eW6f0NKqk&list=PLOep0pi-UBExIxCNegkvCrBuDh0TE7Ihq&index=40

public class FileWriterEx2 {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("notes3.txt", true)) {     //false - то есть файл будет перезаписываться.
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();                 // flush(): очищает буфер вывода, записывая все его содержимое
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("DONE");
    }
}
