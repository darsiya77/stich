package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=0DpIrdzgBI-l6K2j&t=2084
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// Использование IntPredicate в качестве параметра метода

import java.util.Arrays;

import java.util.function.IntPredicate;

public class MainPrimPr2 {

    public static void main(String[] args) {

        int[] array = new int[] { -4, 1, 6, -3, 0, 1, 7 };

        int even = countElement(array, a -> a % 2 == 0);

        int odd = countElement(array, a -> a % 2 != 0);

        System.out.println(Arrays.toString(array));
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
    // пишем метод, который принимает массив и предикат, в методе сравниваем (test) каждый эл.массива с предикатом
    // (который опишем потом в лямбде), и если сравнение тру то считае этот элемент массива.
    public static int countElement(int[] array, IntPredicate pr) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (pr.test(array[i])) {
                count += 1;
            }
        }
        return count;
    }
}
