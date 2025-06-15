package Archive.File.ZadachiKata.readAsString;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamToString {

    /**
     * Метод для чтения данных из InputStream и преобразования их в строку.
     *
     * @param inputStream Входной поток данных.
     * @param charsetName Название кодировки (например, "UTF-8").
     * @return Строка, прочитанная из потока.
     * @throws IOException Если произошла ошибка ввода-вывода.
     */
    public static String convertInputStreamToString(InputStream inputStream, String charsetName) throws IOException {
        // Создаем ByteArrayOutputStream для накопления байтов
        ByteArrayOutputStream result = new ByteArrayOutputStream();

        // Буфер для чтения данных
        byte[] buffer = new byte[1024];
        int length;

        // Читаем данные из InputStream и записываем их в ByteArrayOutputStream
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }

        // Преобразуем байты в строку с использованием указанной кодировки
        return result.toString(charsetName);
    }

    public static void main(String[] args) {
        // Пример использования
        try (InputStream inputStream = InputStreamToString.class.getResourceAsStream("/example.txt")) {
            if (inputStream != null) {
                String content = convertInputStreamToString(inputStream, "UTF-8");
                System.out.println(content);
            } else {
                System.out.println("Файл не найден");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}