package Archive._2PrimitiveTypes.MassiviStroki.Teoriya;

import java.util.Arrays;

public class Stroka {
    public static void main(String[] args) {
        String hello = "Hello\"";
        String specialChars = "r\n\t\"\\";   //  \n - enter, \t - tab, \" - ковычки ("), \\ - слеш (\)
        String empty = "";
        System.out.println(hello);
        System.out.println(specialChars);
        System.out.print(empty);
        System.out.println("");
        System.out.println("______________2___________________");

        char [] charArray = {'a','b','c'};
        System.out.println(Arrays.toString(charArray)); // [a, b, c] - сразу печатаем массив методом Arrays.toString() класса Arrays

        String string = new String(charArray);    // создаем объект string класса String и с помощью конструктора
                                                  // String(charArray) сразу конвертируем объявленный ранее массив символов charArray
                                                  // в строку символов. new - здесь оператор создания объекта string.
        System.out.println(string);               // abc - распечатываем строку string, кот. только что конверир. из массива
        System.out.println("___________3___________");

        char[]KakoyToMassiv = new char[3]; // это я для примера, если бы просто объявил какой-то массив - как его объявляют
        System.out.println(Arrays.toString(KakoyToMassiv)); // выводит в консоль [0,0,0] чаровские символы 0

        char[]charsFromString = string.toCharArray(); // переменной string, которую ранее инициировал как объект класса
                                                      // String обращаюсь к полю класса String а именно к методу
                                                      // toCharArray, который переводит строку в массив символов,
                                                      // т.о. передаю в массив charsFromString данные строки string,
                                                      // которая представляет из себя символы abc и они становятся
                                                      // элементами массива charsFromString

                                                      // Arrays.toString() - метод для вывода на печать массива
        System.out.println(Arrays.toString(charsFromString)); // [a, b, c]
        String s = new String(); // переменная s становится объектом s класса стринг, но для класса стринг так делать
                                 // не обязательно - можно просто сразу присвоить значение переменной класса String
        s = "Привет";
        String a = "Как дела?";  // например, как здесь - переменная а сразу приняла в себя значение "Как дела?"

        String b = new String(KakoyToMassiv);          // для образца просто конвертирую в строку массив "какойТоМассив"
                                                       // выводит чаровские символы 000
        System.out.println(b);

        char[]aa = a.toCharArray();                     // конвертируем строку "а" (Как дела?) в массив символов
        System.out.println(Arrays.toString(aa));        // [К, а, к,  , д, е, л, а, ?]
        System.out.println("___________________4_____________________________");
        int lengthStroki = a.length();
        System.out.println(lengthStroki);               // 9 - вывод на печать длины строки "а" (Как дела?)
        char firstChar = a.charAt(0);                   // (char firstChar = 'К') - получить символ строки по индексу,
                                                        // присвоив его переменной типа char
        System.out.println(firstChar);                  // K - выводим в консоль знач.перем. firstChar (=0-й символ строки а)
        System.out.println(a.charAt(8));                // ? - сразу выводим в консоль послдений (8-q) символ строки а.
        System.out.println(a.endsWith("ла?"));          // true - содержит ли строка определенное окончание
        System.out.println(a.endsWith("ла"));           // false - содержит ли строка определенное окончание
        System.out.println(a.contains("к дел"));       // true - содержит ли строка определенную подстроку

    }
}
