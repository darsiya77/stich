package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=2hM7_G_VpObzlY3Z&t=1425
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// Более подробное объяснение метода isEqual
// default boolean removeIf(Predicate<? super E> filter)
// static <T> Predicate<T> isEqual(Object targetRef)

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class MainIsEqual2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Anna", "Ira", "Katia", "Anna"));

        Predicate<String> pr1 = Predicate.isEqual("Anna");

        Predicate<String> pr2 = new NamePredicat<>("Anna");

        names.removeIf(pr2);

        System.out.println(names);
    }
}
//      создаю обобщенный класс который релизует Predicate
    class NamePredicat<T> implements Predicate<T> {
        private T baseElement;
        public NamePredicat(T baseElement) {
            super();
            this.baseElement = baseElement;
        }
        @Override
        public boolean test(T t) {
            return Objects.equals(t, baseElement);
        }
    }
