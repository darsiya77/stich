package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=Hhrs6vEctvvOBtp9&t=1192
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// Пример использования статического метода not
// default boolean removeIf(Predicate<? super E> filter)
// static <T> Predicate<T> not(Predicate<? super T> target)

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainNot {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

//      Вызываю статический метод через имя интерфейса

        cats.removeIf(Predicate.not(a -> a.getAge() < 6));

        System.out.println(cats);
    }
}
