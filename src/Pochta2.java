import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.youtube.com/watch?v=zKqBS577NOE&t=693s

public class Pochta2 {
    public static boolean isGmailOrOutlook(String email) {

        return email.matches("\\w+@gmail\\.com") ||
                email.matches("\\w+@outlook\\.com");
        /*Pattern p1 = Pattern.compile("\\w+@gmail\\.com");
        Matcher m1 = p1.matcher(email);
        Pattern p2 = Pattern.compile("\\w+@outlook\\.com");
        Matcher m2 = p2.matcher(email);
        boolean isGmail = m1.matches();
        boolean isOutlook = m2.matches();
        return isGmail || isOutlook;*/
    }
}
// Pattern и Matcher - классы для работы с регулярными выражениями (\n, ([A-Z])\w+ ... - для поиска определ.симв. и текста)
// в переменной класса Pattern хранится наше регулярное выражение
// конструкция сравнения - Pattern pt = Pattern.compile("\\d+"); String s = '1998'; Matcher mt = pt.matcher(s)
// метод .matcher - найти и сравнить; метод matches - возвращает буленовскую переменную
