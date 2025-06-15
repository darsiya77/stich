package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=mo9nTzeo1uP0zifK&t=937
// Статический метод generate(Supplier<? extends T> s)

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3_6_generate {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.generate(getRandomNumber(1, 10));

        List<Integer> list = stream.limit(10).collect(Collectors.toList());

        System.out.println(list);

    }
    public static Supplier<Integer> getRandomNumber(int start, int end) {
        class RandGen implements Supplier<Integer> {
            @Override
            public Integer get() {
                return (int) (start + Math.random() * (end - start) + 1);
            }
        }
        return new RandGen();
    }

}

//              Метод static <T> Stream<T> generate(Supplier<? extends T> s)
//        Данный метод применяется для создания бесконечного потока данных на основании данных
//        генерируемых с помощью реализации Supplier. Внимание созданный поток бесконечен, поэтому в
//        случае необходимости собрать данных потока в структуру данных его необходимо ограничить
//        (например с помощью метода limit).
