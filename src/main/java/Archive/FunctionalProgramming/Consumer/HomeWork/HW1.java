package Archive.FunctionalProgramming.Consumer.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HW1 {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 10, 12, 1, 5, 0));

        Consumer<Integer> cons = i -> {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        };
        listOfNumbers.forEach(cons);
    }
}
/*
    1)Реализуйте Consumer<Integer> с помощью которого выведите на экран все нечетные
   числа содержащиеся в List<Integer>.
   */