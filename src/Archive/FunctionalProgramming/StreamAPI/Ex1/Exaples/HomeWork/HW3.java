package Archive.FunctionalProgramming.StreamAPI.Ex1.Exaples.HomeWork;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;

public class HW3 {
    public static void main(String[] args) {

        try {
            Path directory = Paths.get("C:\\Users\\Андрей\\Downloads");

            Optional<Path> largestFile = HW3.findLargestFile(directory);

            largestFile.ifPresent(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Optional<Path> findLargestFile(Path directory) throws IOException {

        if (!Files.isDirectory(directory)) {
            throw new IllegalArgumentException(directory + " is not a directory");
        }

        return Files.list(directory)
                .filter(Files::isRegularFile)
                .max(Comparator.comparingLong(path -> {
                    try {
                        return Files.size(path);
                    } catch (IOException e) {
                        throw new UncheckedIOException(e); // Преобразуем IOException в unchecked
                    }
                }));
    }
}

//     3) Используя Stream API верните адрес файла с максимальным размером в заданном
//        каталоге.
