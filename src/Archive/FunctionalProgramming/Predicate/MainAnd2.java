package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=qjSvhVV8unHOUCFA&t=745
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// Еще один пример использования and
// default boolean removeIf(Predicate<? super E> filter)
// default Predicate<T> and(Predicate<? super T> other)

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainAnd2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(-1, 4, 5, 0, -2));

        Predicate<Integer> pr1 = MainAnd2::test1;
        Predicate<Integer> pr2 = MainAnd2::test2;

        numbers.removeIf(pr1.and(pr2));

        System.out.println(numbers);
    }
    public static boolean test1(Integer n) {
        return n < 0;
    }
    public static boolean test2(Integer n) {
        return n % 2 == 0;
    }
}
