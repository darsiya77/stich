package Other;

public class Okruglenie {
    public static void main(String[] args) {
        System.out.println(parseAndSqrt("12345"));
        System.out.println(Math.pow(111,2));
    }
    public static long parseAndSqrt(String number) {
        long res  = Long.parseLong(number);
        return Math.round(Math.sqrt(res));
    }
}
/*
Реализовать метод, который будет принимать целочисленное (long) число в строковом виде (например "14213123"),
преобразовывать его в тип long, вычислять из него квадратный корень, и округлять получившееся значение
до ближайшего long. Для округления воспользуйтесь классом Math.*/
