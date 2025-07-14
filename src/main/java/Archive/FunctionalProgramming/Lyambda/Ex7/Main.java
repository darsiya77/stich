package Archive.FunctionalProgramming.Lyambda.Ex7;

// Использование лямбда функций для сокращения кода (короче, чем ссылка на метод - LinkFunction.Ex8)
//https://youtu.be/ChTVknYsHeU?si=stEud2EOA8TSA72J&t=1306
//https://drive.google.com/file/d/1FvFcyijJVyOEV7wCzxxvd6ojP9KRFvMf/view

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] { "Anna", "Ira", "Alexander", "Katia" };
        Arrays.sort(names, (a, b) -> a.length() - b.length());

        System.out.println(Arrays.toString(names));
    }
}
