package Archive.FunctionalProgramming.Consumer.BiConsumer;

// https://youtu.be/IVUVcdzcrcw?si=mEWFuhXch63giHiD&t=904
// https://drive.google.com/file/d/1zjlHbNl30oIdcPtODKu_BmsC723JEhLa/view
// Пример применения forEach

import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEach {
    public static void main(String[] args) {

        Map<Integer, String> map1 = Map.of(1, "one", 2, "two", 5, "five");

        BiConsumer<Integer, String> biCons = (a, b) -> System.out.println((b + " ").repeat(a));

        map1.forEach(biCons);

//        map1.forEach((k, v) -> System.out.println("{" +k + " = "+ v + "}"));
//        System.out.println("_______");
//        map1.forEach((k, v) -> System.out.printf("{%d = %s}\n", k, v));
//        System.out.println("_______");
//        map1.forEach((k, v) -> System.out.printf("{%d = %s}\n", k, (v + " ").repeat(k)));
    }
}
