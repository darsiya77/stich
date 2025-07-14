import java.util.regex.Matcher;
import java.util.regex.Pattern;  // https://youtu.be/zKqBS577NOE

// Pattern и Matcher - классы для работы с регулярными выражениями (\n, ([A-Z])\w+ ... - для поиска определ.симв. и текста)
// в переменной класса Pattern хранится наше регулярное выражение
// конструкция сравнения - Pattern pt = Pattern.compile("\\d+"); String s = '1998'; Matcher mt = pt.matcher(s)
// метод .matcher - найти и сравнить; метод matches - возвращает буленовскую переменную

public class Pochta {
    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("kata12@gmail.com"));
        System.out.println(isGmailOrOutlook("Andrey3@outlook.com"));
    }
    public static boolean isGmailOrOutlook(String email) {
//        Pattern ptGmail = Pattern.compile("\\w+@gmail\\.com"); // кладем в перем. класса Pattern наше рег.выражение
//        Matcher mchGmail = ptGmail.matcher(email); // наше рег.выраж. нужно найти в конкретной строке
//        Pattern ptOutlook = Pattern.compile("\\w+@outlook\\.com");
//        Matcher mchOutlook = ptOutlook.matcher(email); // метод .matcher - сравнивает и возвращает перем. класса Matcher
//        boolean isOutloock = mchOutlook.matches(); // метод .matches - возвращает буленовскую переменную
//        boolean ifGmail = mchGmail.matches();

        Pattern ptGmOut = Pattern.compile("\\w+@(gmail|outlook)\\.com");
        Matcher mchGmOut = ptGmOut.matcher(email);
        return mchGmOut.matches();
//        ^\[a-zA-Z0-9\]+@(gmail|outlook)[.](http://com/) - или такое рег.выражение
//        return mchOutlook.matches() || mchGmail.matches();
    }
}
/*
Реализовать метод, который будет принимать целочисленное строку, и отвечать соответствует ли эта строка почтовому ящику
сервисов google (gmail.com) или майкрософт (outlook.com). Будет считать, что в корректном почтовом ящике можно использовать
только цифры и буквы.

Пример ввода: "kata12@gmail.com"
Пример вывода: true
Пример ввода: "@outlook.com"
Пример вывода: false
*/
