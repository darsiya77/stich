package JavaRush;

import java.util.Arrays;

public class task0601Method1 { public static void main(String[] args) {
    int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
    printArray(array);
    reverseArray(array);
    printArray(array);
}

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int hash = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = hash;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
    /*ћетод main выводит слишком много строк информации о различных пон€ти€х.
        Ѕыло бы логично разделить вывод информации о водороде и об острове ява на разные методы.
        —оздай public static void printHydrogenInfo() метод, который должен выводить все строки о водороде.
        “акже создай public static void printJavaInfo() метод, который будет выводить все строки об острове ява.
        Ќаконец, в методе main() вызови эти два метода.
        ќбщий вывод в консоли не должен изменитьс€.

        “ребовани€:
        Х	ƒолжен существовать public static void printHydrogenInfo() метод.
        Х	ƒолжен существовать public static void printJavaInfo() метод.
        Х	ћетод printHydrogenInfo() должен выводить все существующие строки о водороде.
        Х	ћетод printJavaInfo() должен выводить все существующие строки об острове ява.
        Х	¬ методе main() должны вызыватьс€ методы printHydrogenInfo() и printJavaInfo().
        Х	ќбщий вывод в консоли не должен изменитьс€.*/