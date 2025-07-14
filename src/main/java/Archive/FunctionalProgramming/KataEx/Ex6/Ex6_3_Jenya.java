package Archive.FunctionalProgramming.KataEx.Ex6;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex6_3_Jenya {
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
//        System.setIn(is1);

        Scanner scanner = new Scanner(System.in, "UTF-8")
                .useDelimiter("[^\\p{L}\\p{Digit}]+");

        Map<String, Integer> freqMap = new HashMap<>();

        scanner.forEachRemaining(s -> freqMap.merge(s.toLowerCase(), 1, (a, b) -> a + b));
        freqMap.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                        .reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
//    Мама мыла-мыла-мыла раму!
/*
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam,
tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus
imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur
adipiscing elit. Integer vel odio nec mi tempor dignissim.

*/
