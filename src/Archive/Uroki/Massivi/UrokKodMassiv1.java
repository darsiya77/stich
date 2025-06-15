package Archive.Uroki.Massivi;

public class UrokKodMassiv1 {
    public static void main(String[] args) {

        printArray(new int []{2,4,6});  // как в дз просиили - делаем.
        System.out.println("\n"); // печатаю что бы разделить два sout; "\n" - энтер.
        printArrays(31,500,17);  // вот так сокращенноо можно вызвать метод с массивом без всяких - new int []{...}
    }
    static void printArray(int[] arr){            // делаем как просят в задании
        for(int i=0;i< arr.length-1;i++){
            System.out.println(arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
    static void printArrays (int... arr){       // Объявляем массив сокраченно, что бы можно было легче вызвать его потом
        for(int i=0;i< arr.length-1;i++){       //  вызываем цикл, который будет перебирать каждый элемент массива
                                                //  по каждому индексу массива и выводить на печать кроме последнего [i],
            System.out.println(arr[i]);
        }
        System.out.print(arr[arr.length-1]);     //  а последний элемент массива по индексу вызываем на печать методом
                                                 // sout без ln, что бы не перебрасвал на след.строку
    }
}// int nums3[]={1,2,3,5};
   /* Создайте метод static void printArray(int[] arr), который принимает массив целых чисел и выводит их в консоль,
   каждое с новой строки.

        Пример ввода: [2,4,6]
        Пример вывода:
        2
        4
        6

        Требования:
        1. Метод должен принимать массив целых чисел
        2. Метод не должен ничего возвращать
        3. Метод должен выводить каждое число с новой строки*/