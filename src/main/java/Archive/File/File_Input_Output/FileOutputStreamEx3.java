package Archive.File.File_Input_Output;
import java.io.*;

//https://metanit.com/java/tutorial/6.3.php

public class FileOutputStreamEx3 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("C:\\Users\\Андрей\\Downloads\\Java\\File\\Java!.txt");
             FileOutputStream fos = new FileOutputStream("notes.txt")) {
            byte[] buffer = new byte[256];

            int count;
            // считываем в буфер (массив)
            while ((count = fin.read(buffer)) != -1) {

                // записываем из буфера в файл
                fos.write(buffer, 0, count);
            }
            System.out.println("File has been written");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
