package Archive.FunctionalProgramming.KataEx.Ex8_Reduce;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static BigInteger factorial(int value) {

        return Stream.iterate(BigInteger.valueOf(value), newIterate -> newIterate.compareTo(BigInteger.ZERO) > 0,
                nextIterate -> nextIterate.subtract(BigInteger.ONE))
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
