package Archive.FunctionalProgramming.LinkFunction.Ex10;

//Более сложный пример. Композиция функций
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=2134
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

import java.util.Arrays;
import java.util.function.Function;

public class Main3 {
    public static void main(String[] args) {
        Function<Integer,String[]> fun = functionComposition(Main3::intToString, Main3::strToStrArray);

        String[] res = fun.apply(5);

        System.out.println(Arrays.toString(res));
    }
    public static <F, S, R> Function<F,R> functionComposition(Function<F,S> f1, Function<S, R> f2) {
        class Composition {
            public R comp(F t) {

                //  S apply(F t) - метод функционального интерфейса Function

                S temp = f1.apply(t);
                return f2.apply(temp);
            }
        }
        Composition a = new Composition();
        return a::comp;
    }

    // Методы этого же класса используемые для примера:

    public static String intToString(Integer count) {
        return "Hello " + 5;
    }
    public static String[] strToStrArray (String text) {
        String[] array = text.split(" ");
        String[] result = new String[Integer.parseInt(array[1])];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[0];
        }
        return result;
    }
}
