package Archive.FunctionalProgramming.KataEx.Ex6;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex6_2 {
    public static void main(String[] args) throws IOException {

//        String data1 = "Мама мыла-мыла-мыла раму!";
//        String data2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam,\n" +
//                "tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus\n" +
//                "imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur\n" +
//                "adipiscing elit. Integer vel odio nec mi tempor dignissim.";
//
//        InputStream is1 = new ByteArrayInputStream(data1.getBytes());
//        InputStream is2 = new ByteArrayInputStream(data2.getBytes());
//
//        System.setIn(is2);


        new BufferedReader(new InputStreamReader(System.in, "UTF-8"))
                .lines()
                .flatMap(line -> Arrays.stream(line.split("(?U)[^\\p{L}\\p{Digit}]+")))
                .map(String::toLowerCase)
//                .filter(word -> Pattern.compile("^\\p{L}+$").matcher(word).find())
                .collect(Collectors.toMap((k -> k), (v -> 1), (Integer::sum)))
                .entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(10)
                .map(Map.Entry::getKey).forEach(System.out::println);


    }
}

//    Мама мыла-мыла-мыла раму!
/*
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam,
tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus
imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur
adipiscing elit. Integer vel odio nec mi tempor dignissim.
*/