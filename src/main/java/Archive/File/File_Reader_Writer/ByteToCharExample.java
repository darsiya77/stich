package Archive.File.File_Reader_Writer;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ByteToCharExample {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("output.txt");
//             StandardCharsets.UTF_8
             InputStreamReader reader = new InputStreamReader(fileInputStream, "UTF-8");  // ”казываем кодировку
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
