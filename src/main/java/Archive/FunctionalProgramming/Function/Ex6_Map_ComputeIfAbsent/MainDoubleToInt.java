package Archive.FunctionalProgramming.Function.Ex6_Map_ComputeIfAbsent;

// https://youtu.be/wUp2TLL4F6E?si=UJU5Bqk0qmiLwKm3&t=2009
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view
// ѕример применени€ DoubleToIntFunction. ѕринимающие и производ€щие примитивные специализации Function

import java.util.function.DoubleToIntFunction;

public class MainDoubleToInt {

    public static void main(String[] args) {

        DoubleToIntFunction fun = MainDoubleToInt::convert;

        System.out.println(fun.applyAsInt(1.99));
    }
    public static int convert(double num) {
        return (int) num;
    }
}
