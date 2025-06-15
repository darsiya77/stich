package Archive.File.File_Input_Output;
import java.io.*;   // импортирует библиотеку, кот. отвечает за потоки ввода/вывода
public class FileOutputStreamEx2 {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        String str2 = " Super World!";
        FileOutputStream fos = new FileOutputStream("HelloAndreyT.txt", true);   // ј¬“ќћј“»„≈— » —ќ«ƒј≈“—я если файла нет
        //"C:\\Users\\јндрей\\Downloads\\Java\\File\\Hello.txt"
        byte[] buffer = str.getBytes();
        fos.write(buffer);            // - 1 запись
        buffer = str2.getBytes();
        fos.write(buffer);            // - 2 запись
        fos.write(buffer[7]);         // - 3 запись
        fos.write(buffer[0]);         // - 3 запись
        fos.close();
        System.out.println("The file has been written");

        // „то бы записывать данные в файл нужно открыть поток дл€ записи с пом. класса FileOutputStream
        // к-р принимает путь к файлу дл€ записи, если такого файла нет то он ј¬“ќћј“»„≈— » —ќ«ƒј≈“—я
        // new FileOutputStream("...") - может возникнуть исключение - ошибка и нужно ее обработать
        // «аписать строк-й тип данных в файл мы не можем, класс FileOutputStream работает с байтами, а у мен€ переменна€ String str
        // и надо ее перевести в массив с байтами - переводим строку в байты методом getBytes()
        // что бы записать эти байты в файл воспользуюсь методом write
        // метод write может закончитьс€ неудачей и потому требует обработки исключени€
        // можно записать в файл и элемент массива - fos.write(buffer[1]);
        // https://www.youtube.com/watch?v=X2K9HGnBJWQ


    }
}
