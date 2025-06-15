package Archive.FunctionalProgramming.KataEx.Ex6;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex6_4_Scanner {
    public static void main(String[] args) {

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

        new Scanner(System.in, "UTF-8")
                .useDelimiter("[^\\p{L}\\p{Digit}]+").tokens()
                .map(String::toLowerCase).collect(Collectors.toMap((k -> k), (v -> 1), (Integer::sum)))
                .entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(10)
                .map(Map.Entry::getKey).forEach(System.out::println);
    }
}
