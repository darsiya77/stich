package Archive.FunctionalProgramming;

//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=334

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex0 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello", "Cat", "Java", "Bag"));
        System.out.println(list);

        list.removeIf(new Predicate<String>() {                // ������-� Predicate � ���-� ���������� ������:
            @Override
            public boolean test(String t) {
                return t.length() > 3;
            }
        });
        System.out.println(list);
    }

}
/*������ �� ������ ��� ������, ����� ������� ��������� 3. � ������ ���� ����� list.removeIf(Predicate<? super E> filter),
���������� �������� ���. ���������� ���������� Predicate
 */
