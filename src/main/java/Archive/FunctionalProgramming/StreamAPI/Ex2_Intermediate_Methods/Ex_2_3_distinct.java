package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods;

// В базовом списке есть дубли. Однако применение промежуточного метода distinct
// удалит из потока дубликаты, оставив в потоке уникальные значения.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex_2_3_distinct {
    public static void main(String[] args) {

        List<Integer> list = List.of(0, 5, -2, 0, 3, 1, 1, -4, 7);

        list.stream().distinct().forEach(n -> System.out.println(n));

// _______________________________________О важности переопределения equals____________________________________________
        System.out.println("_____________________________________");

        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Luska", 5, "White");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4 };

        Stream<Cat> catToName = Arrays.stream(cats).distinct();

        catToName.forEach(n -> System.out.println(n));
    }
}
