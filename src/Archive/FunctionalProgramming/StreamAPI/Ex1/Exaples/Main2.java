package Archive.FunctionalProgramming.StreamAPI.Ex1.Exaples;


// https://drive.google.com/file/d/1RLRmqdxcyk596KfujPlVzL2qVG8P3J0S/view
// https://youtu.be/PY82g6qZJBQ?si=Z-UYD52n4u6jPrPu&t=1134

import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Umka", 7, "Black");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Luska", 3, "Grey");

        List<Cat> list = List.of(cat1, cat2, cat3, cat4);

        int age = 5;

        List<Cat> result = list.stream()
                .filter(a -> a.getWeight() >= age)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
