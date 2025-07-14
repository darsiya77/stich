package Archive._2PrimitiveTypes.MassiviStroki;

public class Task2310Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw?"));
        //===========================================================================================================

        String x = "К .,,../?араган  Д__+а12 !& ?";
        x = x.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        System.out.println(x);                                  // КараганДа12

        String y = new StringBuilder(x).reverse().toString();
        System.out.println(y);                                  // 21аДнагараК (КараганДа12 - наоборот)

        boolean b = x.equalsIgnoreCase(y);
        System.out.println(b);

        String x1 = "?Шалаш!!!";                                       //  Шалаш!!!
        x1 = x1.replaceAll("[^A-Za-zА-Яа-я0-9]","");   //  Шалаш
        String y1 = new StringBuilder(x1).reverse().toString();        //  шалаШ
        boolean b1 = x1.equalsIgnoreCase(y1);
        System.out.println(b1);
    }
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я0-9]","");   //  Удаляем из строки символы, зн.преп. и пробелы
        String txeT = new StringBuilder(text).reverse().toString();        //  Переворачиваем строку и присв. 2-й перем
        boolean bool = text.equalsIgnoreCase(txeT); // Обявл. бул.перем. bool и присваив. ей результат сравнения 1 и 2 перем.
        return  bool;                               // Возвращаем в метод значение переменной bool
    }
}
                                  /* ReplaceAll + StringBuilder + equels.
                                  5 строк кода.*/
                                  // text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
                                  /* Когда будете работать со второй (обратной) строкой - не забудьте, что в ней тоже надо
                                  убрать все лишние символы и пробелы, прежде чем сравнивать. В этом была моя ошибка.*/

   /* Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая
   читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки
   должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
   Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
   Т.е. русских, китайских и прочих экзотических символов в строке не будет.
        Для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением
        "[^a-zA-Z0-9]".Найдите в классе String метод, выполняющий замену по регулярному выражению и воспользуйтесь им.

        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит
        проверяющая система.

        Пример ввода 1: Was it a cat I saw?
        Пример вывода 1: true
        Пример ввода 2: A palindrome is a word, number, phrase, or other sequence of characters which reads the same
        backward as forward, such as madam or racecar or the number 10801.
        Пример вывода 2: false
        Требования:
        1. Должен быть доступный статический метод boolean isPalindrome(String text)
        2. Работа метода должна удовлетворять условию
        _________________________________________________
        public static boolean isPalindrome(String text) {
	//Твой код здесь
}
        */
