package Archive.Uroki.vetvleniya;

public class Zadanie {

    public static int incrementIfPositive(int a) {
        if 	(a>0){//Твой код здесь
            return a+1;}
        else {
            return a;
        }
    }

    public static void main(String[] args) {
        int x=incrementIfPositive(1);
        System.out.println(x);
    }
}
/*Урок с кодом
       Создайте метод static int incrementIfPositive, который будет принимать целочисленный параметр и возвращать
       это же число, увеличенное на единицу, если оно больше 0, в противном случае метод должен возвращать число без изменений.
       Пример ввода параметра: 8
       Пример возвращаемого значения: 9

       Требования:
       1. Метод должен иметь модификаторы public static
       2. Метод должен принимать в качестве параметра целочисленное значение
       3. Метод должен возвращать целочисленное значение
       4. Метод не должен ничего выводить в консоль*/
