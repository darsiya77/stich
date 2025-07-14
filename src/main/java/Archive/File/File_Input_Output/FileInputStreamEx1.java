package Archive.File.File_Input_Output;
//https://metanit.com/java/tutorial/6.3.php

import java.io.*;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
//    =============================================================================================================
//    Считываем данные по 1 байту и выводим в консоль:

        try (FileInputStream fin = new FileInputStream("notes3.txt")) {
            int i;
            while ((i = fin.read()) != -1) {

                System.out.print(i);
                System.out.print(" ");
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("\nReed from notes3.txt");

        System.out.println("\n================================\n");

//    =============================================================================================================
//    Подобным образом можно считать данные в массив байтов и затем производить с ним манипуляции:

        try (FileInputStream fin = new FileInputStream("notes3.txt")) {
            byte[] buffer = new byte[256];
            System.out.println("File data:");

            int count;
            while ((count = fin.read(buffer)) != -1) {

                for (int i = 0; i < count; i++) {

                    System.out.print((char) buffer[i]);
                }
            }
            System.out.println("\n================================\n");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
//    =============================================================================================================
//    Совместим оба класса и выполним чтение из одного и запись в другой файл:

        try (FileInputStream fin = new FileInputStream("notes.txt");
             FileOutputStream fos = new FileOutputStream("notes_new.txt")) {
            byte[] buffer = new byte[256];

            int count;
            // считываем буфер
            while ((count = fin.read(buffer)) != -1) {

                // записываем из буфера в файл
                fos.write(buffer, 0, count);
            }
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
//  Классы FileInputStream и FileOutputStream предназначены прежде всего для записи двоичных файлов, то есть для записи
//  и чтения байтов. И хотя они также могут использоваться для работы с текстовыми файлами, но все же для этой
//  задачи больше подходят другие классы.