package Archive.Uroki.vetvleniya;

public class ZiklFor {
    public static void printJavaWord(int count) {
        for (int i=0;i<count;i++){
            System.out.println("Java");;
        }
    }

    public static void main(String[] args) {

        printJavaWord(10);
    }
}
    /*В классе Main создайте метод static void printJavaWord(int count), который будет принимать целочисленный параметр
    и выводить в консоль слово “Java” равное ему количество раз.

        Требования:
        1. Метод должен иметь модификаторы public static
        2. Метод должен принимать в качестве параметра целое число
        3. Метод должен выводить в консоль слово Java столько раз, сколько ему передали
        4. Метод не должен ничего возвращать
        5. Метод должен использовать цикл*/