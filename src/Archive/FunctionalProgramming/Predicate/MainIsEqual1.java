package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=HOBIjUogdL8RfaAG&t=1326
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// ������ ������������� ������ isEqual
// default boolean removeIf(Predicate<? super E> filter)
// static <T> Predicate<T> isEqual(Object targetRef)

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainIsEqual1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Anna", "Ira", "Katia", "Anna"));

    //  �������������� �������� ����� ���������� ������, ���.�������� �� ��� ���� ������ test  � ��� ��������,
    //  ���.������� � �������� ��������� ����� ������������ ������. ���� �������� ����� ���������� ��� ���� ������� ������������

        Predicate<String> pr1 = Predicate.isEqual("Anna");

        names.removeIf(pr1);

        System.out.println(names);
    }
}
