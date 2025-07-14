package Archive.FunctionalProgramming.Function.Ex6_Map_ComputeIfAbsent;

// https://youtu.be/wUp2TLL4F6E?si=JO5JTs4l-rke_lAx&t=803
// Пример использования Function в computeIfAbsent

import java.util.HashMap;
import java.util.Map;


public class MainMap {
    public static void main(String[] args) {

        Map<Integer, String> numbers = new HashMap<>(Map.of(1, "one", 5, "five"));

        Integer num = 2;

        String result = numbers.computeIfAbsent(num, n -> "number_" + n);

        result = numbers.computeIfAbsent(1, n -> "number_" + n);

        System.out.println(numbers);

        System.out.println(result);
    }
}
