package Archive.FunctionalProgramming.Supplier.HomeWork;

// https://youtu.be/cl12wAVFPrU?si=VoQaDPn_0GbPn0wJ
// https://drive.google.com/file/d/1SYu7Cum7mGWQypZTUzx6-HwlIhdruQUz/view
// метод T get()

import java.util.function.IntSupplier;

public class MainHW3 {
    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 3};
        IntSupplier intsup = input(digits);
        System.out.println(intsup.getAsInt());
        System.out.println(intsup.getAsInt());
        System.out.println(intsup.getAsInt());
        System.out.println(intsup.getAsInt());
        System.out.println(intsup.getAsInt());
        System.out.println(intsup.getAsInt());
        System.out.println(intsup.getAsInt());
        System.out.println(intsup.getAsInt());
    }

    public static IntSupplier input(int[] array) {

        return new IntSupplier() {
            int index = 0;
            @Override
            public int getAsInt() {
                if (index == array.length) {
                    System.out.println("Ёлементы массива закончились, начинаю перебор заново");
                    index = 0;
                }
                return array[index++];
            }
        };
    }
}

//  3) –еализуйте IntSupplier последовательно возвращающий элемент из массива целых чисел.
