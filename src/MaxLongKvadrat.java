import java.math.BigInteger;

public class MaxLongKvadrat {
    public static void maxLongSqr() {
        BigInteger num = new BigInteger(String.valueOf(Long.MAX_VALUE));
        System.out.println(num.pow(2));
        System.out.println((new BigInteger(String.valueOf(Long.MAX_VALUE)).pow(2)));
    }

    // “.к. BigInteger - значени€ в цифр в нем надо передавать в строковом формате - "2" то используем String.valueOf метод
    // String.valueOf - https://www.youtube.com/watch?v=I0ypcMnwi_M
    // MAX_VALUE - метод максимального значени€ в классах int, byte, double и прочее
    public static void main(String[] args) {
        maxLongSqr();
    }
}
/* –еализовать метод, который выведет на экран квадрат максимального значени€, которое может содержатьс€ в переменной
long. „тобы это значение уместилось, необходимо использовать класс BigInteger

64 бит значени€ от -2^63 до + 2^63-1
(-9_223_372_036_854_775_808 до +9_223_372_036_854_775_807)
*/
