package Archive.File.Main;

import Archive.Uroki.Massivi.Array;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) throws IOException {
//        File folder = new File("C:/Users/Андрей/Downloads/");
//
//        for (File file : folder.listFiles()) {
//
//            System.out.println(file.getName()); // без .getName() выдаст полные адреса
//        }

        System.out.println("______\nDONE\n_________");
        File a1 = new File(".\\a\\b\\..\\b\\c\\.\\file.txt");
        System.out.println(a1.getCanonicalPath());
        File a2 = new File("a\\b\\c\\file.txt");
        System.out.println(a2.getCanonicalPath());
        File a3 = new File("a\\b\\..\\file.txt");
        System.out.println(a3.getCanonicalPath());
        File a4 = new File("a\\..\\b\\c\\file.txt");
        System.out.println(a4.getCanonicalPath());
        File a5 = new File("a\\.\\b\\..\\c\\.\\file.txt");
        System.out.println(a5.getCanonicalPath() + "\n____________");

        // Создание Path с помощью Paths.get()
        Path path1 = Paths.get("C:/Users/username/documents/file.txt");

        // Создание Path с помощью File.toPath()
        File file = new File("C:/Users/username/documents/file.txt");
        Path path2 = file.toPath();

        System.out.println(path1);
        System.out.println(path2);

        Path path = Paths.get("путь/к/твоему/файлу.txt");

        try (InputStream inputStream = Files.newInputStream(path)) {
// Здесь ты можешь читать данные из inputStream
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключения
        }


    }
}
// listFiles() — это метод, который возвращает список файлов в директории с именем «c:/path/». А getName выдает имя файла.