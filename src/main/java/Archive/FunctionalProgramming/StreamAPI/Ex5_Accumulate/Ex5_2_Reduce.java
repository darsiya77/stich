package Archive.FunctionalProgramming.StreamAPI.Ex5_Accumulate;

// https://drive.google.com/file/d/1gAxZTWJUb-C13SYfHiUguavWfkUZZWXV/view
// https://youtu.be/K9xypx_LvRg?si=Z6zwPj4e1wxiY3h4&t=507
// Метод T reduce(T identity, BinaryOperator<T> accumulator)

import java.util.List;

public class Ex5_2_Reduce {

    public static void main(String[] args) {

        List<String> list = List.of("world", "!");

        String result = list.stream().reduce("Hello", (a, b) -> a + " " + b);

        System.out.println(result);

//        В примере реализована конкатенация элементов потока. В качестве начального элемента
//        используется строка «Hello».
    }
}
//           Создает результат аккумулируя элементы потока. В качестве базового элемента берется первый
//    параметр метода и новый результат получается применение accumulator к базовому и следующему
//    элементу потока. Вычисленный результат становиться базовым и вычисления повторяются для
//        следующего элемента. Разница с предыдущим методом в том какой элемент выбирается в качестве
//        базового.