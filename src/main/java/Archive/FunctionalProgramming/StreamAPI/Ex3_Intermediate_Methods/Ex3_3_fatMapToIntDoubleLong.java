package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;


// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=YyUH2_4emnZcpq1D&t=557
// ѕромежуточные методы дл€ изменени€ потока

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex3_3_fatMapToIntDoubleLong {

    public static void main(String[] args) {

        String[] array = new String[] { "C", "Java", "Fortran" };

        IntStream stream = Arrays.stream(array)
                .flatMapToInt(String::codePoints);   // codePoints - метод возвращает поток интов-кодировок, из которых состоит строка

        stream.forEach(System.out::println);

//        ¬ примере на основе каждого элемента базового потока Stream<String> создаетс€ поток целых
//        чисел (кодировка каждого символа в этой строке) и созданные потоки укладываютс€ в один
//        результирующий поток.
    }
}
//        ћетоды:
//        DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)
//        IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
//        LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
//        ƒанные методы порождают потоки примитивного типа (примитивные специализации Stream) на
//        основании каждого элемента текущего потока. ѕорожденные потоки Ђукладываютс€ї в общий
//        порожденный поток.