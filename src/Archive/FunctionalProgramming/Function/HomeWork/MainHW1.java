package Archive.FunctionalProgramming.Function.HomeWork;

// https://youtu.be/wUp2TLL4F6E?si=c4-iXIZxyYLDjRGr
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view

import java.util.function.Function;
import java.util.function.Predicate;

public class MainHW1 {
    public static void main(String[] args) {

        Function<Integer[], Integer> fun = MainHW1::count;

        Integer[] arr = new Integer[]{1,3,5,6,45,71,19,9,2, 11117};

        System.out.println(fun.apply(arr));
        System.out.println(isPrim(3));
    }

    public static boolean isPrim (Integer num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static Integer count (Integer[] array) {
        Predicate<Integer> pr = MainHW1::isPrim;
        Integer count = 0;
        for (Integer num : array) {
            if (pr.test(num)) {
                count++;
            }
        }
        return count;
    }
}

/*
        1) С помощью реализации Function<Integer[],Integer> и реализации Predicate<Integer> (да нужно
        вспоминать и предыдущую лекцию ?) реализуйте функцию которая вернет количество простых
        чисел в массиве целых чисел. Например [5,6,7,8,9,10] => 2
        */
