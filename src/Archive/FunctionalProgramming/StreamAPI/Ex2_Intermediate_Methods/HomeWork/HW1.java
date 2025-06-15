package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods.HomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HW1 {
    public static void main(String[] args) {
        String text = "Я помню чудное мгновенье:\n" +
                       "Передо мной явилась ты,\n" +
                       "Как мимолетное виденье,\n" +
                       "Как гений чистой красоты.";



        Arrays.stream(text.split("[\\s\\p{Punct}]+"))       // через Arrays массив строк -> в стрим.
                .filter(word -> word.length() <= 5)
                .forEach(System.out::println);
//                .collect(Collectors.joining(" "));                        // сбор в строку .collect(...)

//        System.out.println(result);
    }
}

//  1) Удалите из строки текста все слова длиннее 5 символов.