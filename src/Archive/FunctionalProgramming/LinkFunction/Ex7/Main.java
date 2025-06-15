package Archive.FunctionalProgramming.LinkFunction.Ex7;

//Функциональные интерфейсы и исключения
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1675
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Saver<String> sr = Main::saveToFile;
        try {
            sr.saveTo("Hello world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> void saveToFile(T el) throws IOException {
        PrintWriter pw = new PrintWriter(new File("save.txt"));
        pw.println(el);
    }
}
