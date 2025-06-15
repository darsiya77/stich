package Archive.FunctionalProgramming;

//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=334

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex0 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello", "Cat", "Java", "Bag"));
        System.out.println(list);

        list.removeIf(new Predicate<String>() {                // реализ-я Predicate с пом-ю анонимного класса:
            @Override
            public boolean test(String t) {
                return t.length() > 3;
            }
        });
        System.out.println(list);
    }

}
/*Убрать из списка все строки, длина которых первышает 3. У списка есть метод list.removeIf(Predicate<? super E> filter),
параметром которого явл. реализация интерфейса Predicate
 */
