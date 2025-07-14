package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.math.BigInteger;
/*=====================================================================================================================
Ctrl+Alt+L - приведение кода в человеческий вид с отступами как положено по Кодстайлу
======================================================================================================================*/

public class Faktorial_BigInteger {
    public static void main(String[] args) {
        System.out.println(getFactorial(3));
    }

    public static BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
