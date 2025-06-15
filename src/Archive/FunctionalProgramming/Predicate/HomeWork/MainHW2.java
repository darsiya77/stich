package Archive.FunctionalProgramming.Predicate.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainHW2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Anna", "Ira", "Katia", "Anna", "Fedor", "Ivan", "Faina", "Lev"));

        char[] chars = new char[]{'F', 'A', 'K'};

        System.out.println(names);

        Predicate<String> removePredicate = line -> {
            for (char c : chars) {
                if (c == line.charAt(0)) {
                    return true;
                }
            }
            return false;
        };

        names.removeIf(removePredicate);
        System.out.println(names);
    }
}

  /*  Используя реализацию Predicate<String> реализуйте удаление со списка строк, строки первая
        буква которых задается отдельным массивом символов. Например если этот массив содержит
        ['h','a','t'] то со списка стоит удалить все строки которые начинаются с этих букв.*/
