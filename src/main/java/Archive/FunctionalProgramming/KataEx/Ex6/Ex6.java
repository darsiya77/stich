package Archive.FunctionalProgramming.KataEx.Ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex6 {
    public static void main(String[] args) {

//        InputStreamReader inputStreamReader = new InputStreamReader(System.in, StandardCharsets.UTF_8);

        StringBuilder textSB = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                textSB.append(line).append('\n');
            }

//            System.out.println("StringBuilder ÑÎÁÐÀÍ!");
//            System.out.print(textSB);

        } catch (IOException e) {
            System.out.println("FALL");
            e.printStackTrace();
        }
//        System.out.print("StringBuilder textSB = " + textSB);

//        Arrays.stream(textSB.toString().split("\\s+|[,\\.]\\s+")).map(String::toLowerCase)
//                .filter(word -> Pattern.compile("^\\p{Alnum}+$").matcher(word).find())

        Map<String, Integer> frequencyMap = Arrays.stream(textSB.toString().split("\\s+|[,\\.]\\s+"))
                .map(String::toLowerCase)
                .filter(word -> Pattern.compile("^\\p{Alnum}+$").matcher(word).find())
                .collect(Collectors.toMap((k -> k), (v -> 1), (Integer::sum)));


        frequencyMap.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>> comparingInt(Map.Entry::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))   // Comparator.comparingInt(Map.Entry::getValue).reversed()
                .limit(10).map(Map.Entry::getKey).forEach(System.out::println);

    }

    private static Comparator<Map.Entry<String, Integer>> descendingFrequencyOrder() {
        return Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                .reversed()
                .thenComparing(Map.Entry::getKey);
    }
}
//    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam,
//        tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget
//        metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet,
//        consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.