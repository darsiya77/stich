package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=oE3TJmFbMChVYapz&t=1736
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// Пример реализации и использования BiPredicate
// default boolean removeIf(Predicate<? super E> filter)
// default Predicate<T> and(Predicate<? super T> other)

import java.util.function.BiPredicate;

public class MainBiPr {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPred = (a, b) -> a.length() > b;

        System.out.println(biPred.test("Hello", 3));
    }
}
