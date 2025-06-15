package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods.HomeWork;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HW2 {
    public static void main(String[] args) {
        String text = "Я помню чудное мгновенье:\n" +
                "Передо мной явfdилась ты,\n" +
                "Как мимолетное видSQnенье,\n" +
                "Как гений чистой красоты.";


        text.replaceAll("[^A-Za-z]", "").chars().forEach(symbol -> System.out.print((char) symbol));

//        System.out.println(result);
    }
}

//    Удалите из строки символы которые не являются буквами английского алфавита.
