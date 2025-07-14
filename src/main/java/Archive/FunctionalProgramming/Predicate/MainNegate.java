package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=7j2ml2ejI2rPcI8R&t=1125
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// Пример использования negate()
// default boolean removeIf(Predicate<? super E> filter)
// default Predicate<T> negate() {return (t) -> !test(t);}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainNegate {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(-1, 4, 5, 0, -2));

        Predicate<Integer> pr1 = n -> n > 0;

        numbers.removeIf(pr1.negate());

        System.out.println(numbers);
    }
}
