package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=SYe1mogLoiQGbbaF&t=1168
// Статический метод iterate(T seed, UnaryOperator<T> f)

import java.util.stream.Stream;

public class Ex3_8_iterate {

    public static void main(String[] args) {

        Stream<String> stream = Stream.iterate("A", n -> n + n);

        stream.limit(4).forEach(System.out::println);
    }

//    С помощью метода iterate получаем Stream<String>. В качестве начального значения
//    используется значение «A». На каждом шаге к строке дописывается результат прошлого вызова. Но
//    условие прекращения генерации отсутствует. Поэтому такой вид потока нуждается в ограничении.
}

//              Метод static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
//        Данный метод применяется для создания бесконечного потока данных на основании данных
//        генерируемых с помощью применения реализации UnaryOperator к seed. Важное замечание что next
//        применяется к результату работы предыдущего вызова этого же метода. seed это начальное значение
//        задаваемое явно. Создаваемый поток бесконечен, поэтому его стоит ограничивать (например с
//        помощью метода limit).