package Archive.Uroki.vetvleniya;

public class Vozrast {
    public static boolean determineAdult(int age) {
        if (age>=18) {
            return true;
        }
        if (age<0) {
            System.out.println("Ошибка! Введите правильный возраст.");
            return false;
        }
        return false;//Твой код здесь
    }

    public static void main(String[] args) {
        determineAdult(-1);
    }
}
/*    Создайте метод static boolean determineAdult(int age), который будет принимать возраст человека и возвращать
логическое значение, равное true если он 18 и больше и false если он меньше 18,
если переданное число меньше 0, метод должен вывести в консоль “Ошибка! Введите правильный возраст.” и вернуть false.
Требования:
1. Метод должен иметь модификаторы public static
2. Метод должен принимать в качестве параметра целое число
3. Метод должен возвращать логическое значение*/
