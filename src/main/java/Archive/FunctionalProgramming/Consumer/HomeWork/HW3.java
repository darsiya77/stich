package Archive.FunctionalProgramming.Consumer.HomeWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiConsumer;

public class HW3 {
    public static void main(String[] args) {

        BiConsumer<String, File> biCon = (str, f) -> {
            try (FileWriter fileWriter = new FileWriter(f, true)) {
                fileWriter.write('\n'); // .append
                fileWriter.write(str);     // .append
            } catch (IOException e) {
                System.err.println("ќшибочка!");
            }
        };

        biCon.accept("Hello, World from may of 2025", new File("output.txt"));
    }
}

/*
        3) –еализуйте BiConsumer<String, File> добавл€ющий строку в конец файла указанного в
        качестве параметра.
        */
