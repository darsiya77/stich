package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods.HomeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HW3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("UmkA", 7, "Black");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");

        List<Cat> cats = List.of(cat1, cat2, cat3, cat4);

        List<Cat> newCats = cats.stream()
                .filter(cat -> cat.getWeight() >= 3)
                .sorted(Comparator.comparing(Cat::getName)) // Comparator.comparing - принимает Function, возвращает Comparator, в качестве Function выступает метод getName, который принимает Cat и возвращает String
                .collect(Collectors.toList());

        System.out.println(newCats);
    }
}



//          3) Удалите из List<Cat> всех кошек вес которых меньше 3 кг, отсортируйте их по именам (в
//        лексикографическом порядке) и соберите результат в новый список Cat.
