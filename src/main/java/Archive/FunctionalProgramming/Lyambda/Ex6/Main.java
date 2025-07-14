package Archive.FunctionalProgramming.Lyambda.Ex6;

// Лямбда функции и исключения
//https://youtu.be/ChTVknYsHeU?si=stEud2EOA8TSA72J&t=1125
//https://drive.google.com/file/d/1FvFcyijJVyOEV7wCzxxvd6ojP9KRFvMf/view

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Saver saver = (obj) ->{
            File file = new File("save.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println(obj.toString());
            pw.close();
        };
        try {
            saver.save("Hello world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}