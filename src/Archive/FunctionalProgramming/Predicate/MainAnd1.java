package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=hAe7VzCLPx9kuenc&t=638
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// ������ ������������� ������ and
// default boolean removeIf(Predicate<? super E> filter)
// default Predicate<T> and(Predicate<? super T> other)

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainAnd1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

        Predicate<Cat> pr1 = a -> a.getAge() < 5;
        Predicate<Cat> pr2 = a -> a.getName().startsWith("K");

// default ������ and ���������� Predicate

        cats.removeIf(pr1.and(pr2));

// pr1.and(pr2) - ���� ����� ������ ����� ��������, ������� ���� true ���� pr1 - true � pr2 - true

        System.out.println(cats); // - ��������� ��� ����, ����� ���� (������� 2 ����, ��� ���������� �� "�")

    }
}
