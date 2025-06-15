package Archive.File.File_Input_Output;

import java.io.*;

public class FileInputStreamEx2 {
    public static void main(String[] args) throws Exception
    {
        //создаем объект FileInputStream, привязанный к файлу «c:/data.txt».
        FileInputStream inputStream = new FileInputStream("hello.txt");
        long sum = 0;

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            sum += data; //добавить его к общей сумме
        }
        inputStream.close(); // закрываем поток

        System.out.println(sum); //выводим сумму на экран.
    }
}
