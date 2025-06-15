package Archive.FunctionalProgramming.StreamAPI.Ex1.Exaples.HomeWork;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW2 {
    public static void main(String[] args) {

        List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream = intList.stream().filter(i -> i % 2 == 1).sorted();
        List<Integer> sortedIntList = stream.collect(Collectors.toList());

        System.out.println(sortedIntList);
    }
}

//     2) »спользу€ Stream API и List<Integer> выделите только нечетные числа, отсортируйте их
//        по возрастанию и соберите в новый список.
