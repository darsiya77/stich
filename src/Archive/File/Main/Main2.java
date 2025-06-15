package Archive.File.Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Path filepath = Paths.get(".\\a\\b\\..\\b\\c\\.\\file.txt");
        Path filepath2 = Paths.get("a\\b\\c\\file.txt");
        System.out.println(Files.isSameFile(filepath, filepath2));
    }
}
