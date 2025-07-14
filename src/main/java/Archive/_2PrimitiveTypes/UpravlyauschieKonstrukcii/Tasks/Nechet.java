package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;
/*Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него,
через запятую. Конец вывода должен перевести курсор на новую строку.

        Пример ввода: [3,5,20,8,7,3,100]

        Пример вывода: 3,5,7,3



        Требования:
        Сигнатура метода должна быть: printOddNumbers(int[] arr)*/ // Условия задачи
public class Nechet {
    public static void main(String[] args) {
        printOddNumbers(new int []{2,3,5,20,8,-7,1,100});
    }
    public static void printOddNumbers(int[] arr) {
        int i = 0;
        StringBuilder oddArray = new StringBuilder();
        for (; i < arr.length;i++) {
            if (arr[i] % 2 != 0) {
                oddArray.append(arr[i]);
                break;
            }
        }
        i++;
        for (; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArray.append(",").append(arr[i]);
            }
        }
        System.out.println(oddArray);
    }
}
