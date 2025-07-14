package Archive.FunctionalProgramming.StreamAPI.Ex1.Exaples.HomeWork;

import java.util.List;

public class HW1 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Umka", 7, "Black");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Luska", 3, "Grey");

        List<Cat> list = List.of(cat1, cat2, cat3, cat4);
        String theLongestName = list.stream()
                .max((c1, c2) -> c1.getName().length() - c2.getName().length())
                .get().getName();
        System.out.println(theLongestName);
    }
}

//  1)»спользу€ Stream API и List<Cat> верните самое длинное им€ кота в этом списке.
