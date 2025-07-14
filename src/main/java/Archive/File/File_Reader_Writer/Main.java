package Archive.File.File_Reader_Writer;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, World!");
            writer.newLine();  // Добавление новой строки
            writer.write("Java I/O is awesome!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
