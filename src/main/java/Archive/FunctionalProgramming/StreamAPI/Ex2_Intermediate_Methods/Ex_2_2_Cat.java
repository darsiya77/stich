package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_2_2_Cat {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("UmkA", 7, "Black");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");

        Cat[] cats = new Cat[]{cat1, cat2, null, cat3, cat4};

        Stream<Cat> catToName = Arrays.stream(cats)
                .filter(Objects::nonNull)
                .filter(a -> a.getWeight() > 5);
        try {
            List<Cat> result = catToName.collect(Collectors.toList());
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
