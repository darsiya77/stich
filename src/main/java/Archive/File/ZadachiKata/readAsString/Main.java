package Archive.File.ZadachiKata.readAsString;

import Archive.Generics.ArrayList.ArrayList;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream reader = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(reader, StandardCharsets.US_ASCII));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int inputRead;

        while ((inputRead = inputStream.read()) != -1) {
            outputStream.write(inputRead);
        }
        return outputStream.toString(charset);
    }
}
//    –еализуйте метод, который зачитает данные из InputStream и преобразует их в строку, использу€ заданную кодировку.
//    InputStream последовательно возвращает четыре байта: 48 49 50 51.
//    ћетод, вызванный дл€ такого InputStream и кодировки ASCII, должен вернуть строку: "0123".