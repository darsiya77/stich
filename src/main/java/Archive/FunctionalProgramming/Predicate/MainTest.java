package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=bWKAeOrz2qKd3dSa&t=170
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// Использование Predicate в методе removeIf
// default boolean removeIf(Predicate<? super E> filter)
// boolean test(T t) - метод интерфейса Predicate

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

// Реализация Predicate с помощью лямбда функции

        cats.removeIf(a -> a.getAge() < 6);

// Пример реализации с помощью ссылки на метод

        cats.removeIf(MainTest::testCat);

        System.out.println(cats);
    }

    public static boolean testCat(Cat cat) {
        return cat.getAge() < 6;
    }
}

