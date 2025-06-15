package Archive.FunctionalProgramming.Predicate.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class MainHW1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Anna", "Ira", "Katia", "Anna", "Fedor", "Ivan", "Faina", "Lev"));
        System.out.println(names);

        names.removeIf(line -> line.startsWith("F"));

        System.out.println(names);
    }
}

/*    С помощью реализации Predicat<String> реализуйте удаление со списка строк начинающихся с
        определенной буквы. Например удалить все строки которые начинаются на букву F.*/
