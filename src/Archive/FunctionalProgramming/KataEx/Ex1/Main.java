package Archive.FunctionalProgramming.KataEx.Ex1;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator u = sqrt();
        System.out.println(u.apply(5));
    }
    public static UnaryOperator<Integer> sqrt() {

        return x -> (int) Math.pow(x, 2);
    }
}

//    Напишите метод с названием sqrt, который возвращает реализацию функционального интерфейса UnaryOperator,
//    который принимает целое число(тип int) и возвращает его квадрат.
//
//
//
//        Требования:
//
//        1. Должен быть метод public UnaryOperator sqrt()
//
//        2. Метод должен возвращать реализацию интерфейса UnaryOperator.
//
//        3. Реализация должна соответствовать условию

