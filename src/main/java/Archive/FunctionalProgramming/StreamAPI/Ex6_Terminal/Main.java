package Archive.FunctionalProgramming.StreamAPI.Ex6_Terminal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, List<Integer>> result = numbers.stream()
                .collect(Main::createMap, Main::addToMap, Main::mergeMap);
        System.out.println(result);
    }
    public static Map<String, List<Integer>> createMap() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("even", new ArrayList<>());
        map.put("odd", new ArrayList<>());
        return map;
    }
    public static void addToMap(Map<String, List<Integer>> map, Integer element) {
        if (element % 2 == 0) {
            map.get("even").add(element);
        } else {
            map.get("odd").add(element);
        }
    }
    public static void mergeMap(Map<String, List<Integer>> map1, Map<String, List<Integer>> map2) {
        map2.forEach((k, v) -> map1.get(k).addAll(v));
    }
}
