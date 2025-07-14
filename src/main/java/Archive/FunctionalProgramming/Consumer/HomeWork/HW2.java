package Archive.FunctionalProgramming.Consumer.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Hallo", "Love4you", "Darsiya77", "Awesome", "Belgpgrpd2025", "333", "World!"));

        List<String> dopList = new ArrayList<>();

        Consumer<String> con = s -> {
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                dopList.add(s);
            }
        };

        list.forEach(con);
        System.out.println(list);
        System.out.println(dopList);
    }
}

/*
    2)Реализуете Consumer<String> с побочным эффектом в виде занесения всех строк
    содержащих цифры во вспомогательный список.
        */
