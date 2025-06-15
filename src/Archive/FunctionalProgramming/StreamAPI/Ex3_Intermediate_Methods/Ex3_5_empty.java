package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=mX67F47kRebQ0luV&t=754

import java.util.stream.Stream;

public class Ex3_5_empty {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.empty();

        stream.forEach(n -> System.out.println(n));
    }
//    ¬ примере продемонстрировано создание пустого потока. ¬ чем можно убедитс€ использовав
//    любой из терминальных методов.
}

//    ƒанный метод примен€етс€ дл€ создани€ пустого потока. —оздаетс€ поток в котором отсутствуют
//        элементы данных.
