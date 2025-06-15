package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods;

//Метод Stream<T> limit(long maxSize)

import java.util.List;

public class Ex_2_4_limit {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 5, -2, 0, 3, 1, 1, -4, 7);
        list.stream()
                .filter(n -> n >= 0)                                 //  0 5 0 3 1 1 7
                .sorted()                                            //  0 0 1 1 3 5 7
                .limit(3)
                .forEach(n -> System.out.println(n));
//                                                                    0
//                                                                    0
//                                                                    1

    }
}
