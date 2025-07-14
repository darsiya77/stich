package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii;

import java.math.BigInteger;

public class BigInteger2 {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("10");
        BigInteger c = new BigInteger("1");
        int a = 333;
        String s = String.valueOf(a);
        BigInteger i = BigInteger.valueOf(a);

        System.out.println(c+String.valueOf(a));// 1333
        System.out.println("BigInteger сложение (c + c) = " + c.add(c)); // 2 - Бигинтеджер можно складывать только через функцию add
        System.out.println("BigInteger c = " + c); // 1
        System.out.println("a + a = " + a + a); // 666
        System.out.println("String s = " + s);
        System.out.println("BigInteger i = " + i);
        //System.out.println(c+c);  перем. с - класс бигинтеджер - их так складывать выдаст ошибку

    }
/*    https://pr0java.blogspot.com/2015/05/biginteger-bigdecimal_70.html
==========================================================================================================
Для преобразования обычного числа в число с произвольной точностью используется статический метод valueOf()
Например: BigInteger num = new BigInteger(String.valueOf(x));
с целочисленным литералом или целочисленной переменной, переданной методу как аргумент. Три константы —
ZERO, ONE и TEN — моделируют нуль, единицу и число десять в операциях с объектами класса BigInteger.
==========================================================================================================
Метод toByteArray() преобразует объект в массив байтов.

Большинство методов класса BigInteger моделируют целочисленные операции и функции, возвращая объект класса BigInteger:

abs() — возвращает объект, содержащий абсолютное значение числа, хранящегося в данном объекте this;
add(x) — операция сложения this + x;
and(x) — операция побитовой конъюнкции this & x;
andNot(x) — операция побитовой дизъюнкции с дополнением this & (~x);
divide(x) — операция деления this / x;
divideAndRemainder(x) — возвращает массив из двух объектов класса BigInteger, содержащих частное и остаток от деления this на x;
gcd(x) — наибольший общий делитель абсолютных значений объекта this и аргумента x;
max(x) — наибольшее из значений объекта this и аргумента x;
min(x) — наименьшее из значений объекта this и аргумента x;
mod(x) — остаток от деления объекта this на аргумент метода x;
modInverse(x) — остаток от деления числа, обратного объекту this, на аргумент x;
modPow(n, m) — остаток от деления объекта this, возведенного в степень n, на m;
multiply(x) — операция умножения this * x;
negate() — перемена знака числа, хранящегося в объекте;
not() — операция отрицания ~this;
or(x) — операция побитовой дизъюнкции this | x;
pow(n) — операция возведения числа, хранящегося в объекте, в степень n;
remainder(x) — операция взятия остатка от деления this % x;
shiftLeft(n) — операция сдвига влево this << n;
shiftRight(n) — операция арифметического сдвига вправо this >> n;
signum() — функция sign(x);
subtract(x) — операция вычитания this — x;
xor(x) — операция "исключающее ИЛИ" this ^ x.*/
}
