package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii;

import java.math.BigInteger; // нужно импортировать класс BigInteger из библиотеки java.math.BigInteger

public class BigInteger1 {
    public static void main(String[] args) {
        BigInteger big1 = new BigInteger("123"); // Вызываем объект класса BigInteger и присваиваем переменной
        BigInteger big2 = new BigInteger("1");
        BigInteger big0 = new BigInteger("100");

        big0 = big1.add(big2); // 123+1 - т.к. переменные big0,1,2 - не примитивные, а ссылочные, то b1+b2 - будет ошибка
        big0 = big0.add(big2); // 124+1 - вместо + как было бы с int используем методы (вызываем через ".") класса BigInteger
        big0 = big0.add(big1); // 125+123; add - метод класса BigInteger, отвечающий за "сложение".
        big0 = big0.multiply(big1); // 248 * 123

        System.out.println (big0); // результат от 248 * 123 = 30_504
        System.out.println(big0.multiply(big2)); // результат от 30_504 * 1 = 30_504
        System.out.println(big0.divide(big1)); // результат от 30_504 / 123 = 248
        System.out.println(big0.divide(new BigInteger("2"))); // результат от 30_504 / 2 = 30_504
        maxLongSqr();
    }
    public static void maxLongSqr() {
       BigInteger num = new BigInteger(String.valueOf(Long.MAX_VALUE));
        System.out.println(num.pow(2));
    }
}