package Archive.File.File_Input_Output;
//https://metanit.com/java/tutorial/6.3.php

import java.io.FileOutputStream;
import java.io.IOException;

//������� ������ � ����:

public class FileOutputStreamEx1 {
    public static void main(String[] args) {

        String text = "Hello world!"; // ������ ��� ������
        String text2 = "\nAAAAAAA!"; // ������ ��� ������

        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {

            // ������� ������ � �����
            byte[] buffer = text.getBytes();
            byte[] buffer2 = text2.getBytes();


            fos.write(buffer, 0, buffer.length);                     //fos.write(buffer[0]); // ������ ������� �����
            fos.write(buffer2, 0, buffer2.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
