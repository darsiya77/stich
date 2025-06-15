package Archive.FunctionalProgramming.KataEx.Ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class BufRead {
    public static void main(String[] args) throws IOException {

        // Пример BufferedReader (можно заменить на чтение из файла или другого источника)

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));

        // Преобразование BufferedReader в поток слов
        Stream<String> wordStream = reader.lines()                    // Получаем поток строк
                .flatMap(line -> Arrays.stream(line.split("\\s+")))   // Разбиваем каждую строку на слова
                .filter(word -> !word.isEmpty());                     // Игнорируем пустые строки

        // Пример использования потока
        wordStream.forEach(System.out::println);

        // Закрываем BufferedReader (важно для реальных файлов!)
        reader.close();
    }
}
