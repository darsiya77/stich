package Archive.File.File_Reader_Writer;

import java.io.*;

//https://metanit.com/java/tutorial/6.8.php
//https://www.youtube.com/watch?v=n7eW6f0NKqk&list=PLOep0pi-UBExIxCNegkvCrBuDh0TE7Ihq&index=40

public class FileWriterEx2 {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("notes3.txt", true)) {     //false - �� ���� ���� ����� ����������������.
            // ������ ���� ������
            String text = "Hello Gold!";
            writer.write(text);
            // ������ �� ��������
            writer.append('\n');
            writer.append('E');

            writer.flush();                 // flush(): ������� ����� ������, ��������� ��� ��� ����������
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("DONE");
    }
}
