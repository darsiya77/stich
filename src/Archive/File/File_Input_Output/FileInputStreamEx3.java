package Archive.File.File_Input_Output;

import java.io.*;

// Можно считать данные в массив байтов и затем производить с ним манипуляции:
// int read(byte[] buffer): считывает байты из потока в массив buffer. После чтения возвращает число считанных байтов.
// Если ни одного байта не было считано, то возвращается число -1.

public class FileInputStreamEx3 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("HelloAndreyT.txt")) {
            byte[] buffer = new byte[256];
            System.out.println("File data:");

            int count;
            while ((count = fin.read(buffer)) != -1) {

                for (int i = 0; i < count; i++) {

                    System.out.print((char) buffer[i]);
                }
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
