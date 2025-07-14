public class Parse {
    public static void main(String[] args) { //  https://www.youtube.com/watch?v=4WoOwkX14xA
        parseAndPrintNumber("1233");
    }
    public static void parseAndPrintNumber(String str) {
        int number = Integer.parseInt(str);
        number = number / 2;
        System.out.println(number);
    }
}
/*
Требования:

Метод не должен быть статическим.
Метод не должен ничего возвращать.
Метод принимает в качестве параметра строку, например "1234".
Метод должен получать из строки число типа int, делить его на 2 и выводить его в консоль, используя System.out.println.
*/
