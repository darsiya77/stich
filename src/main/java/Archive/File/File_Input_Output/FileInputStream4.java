package Archive.File.File_Input_Output;

import java.io.*;


public class FileInputStream4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("HelloAndreyT.txt");
        int i;
        while ((i = fin.read()) != -1) {
            System.out.print((char)i);
        }
        fin.close();
        System.out.println("");
    }
}
// Для чтения из файла -  FileInputStream
// Для чтениея используем метод read
// Пока выражение (i = fin.read()) != -1 - true, печатаем посимвольно - System.out.print((char)i)
// read будет читать до тех пор, пока ничего не останется и затем метод read вернет -1
// потоки ввода/вывода после работа надо закрывать - fin.close();
// https://www.youtube.com/watch?v=X2K9HGnBJWQ