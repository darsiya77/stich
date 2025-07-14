package Collections;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Как вас зовут?");
//        String name = in.nextLine();
//        System.out.println("Здравствуйте, " + name + "!");
//        System.out.println("Ваше имя не подходит, попробуйте еще");
//        name = in.nextLine();
//        System.out.println("Здравствуйте, " + name + "!");



        int c = Integer.parseInt("42", 10);
        int c1 = Integer.parseInt("1110101011", 2);
        int c2 = Integer.parseInt("77", 8);
        int c3 = Integer.parseInt("99", 16);
        System.out.println(c + "\n" + c1 + "\n" + c2 + "\n" + c3);
        System.out.println("____________");
        int b = Integer.parseInt("10", 10);
        int b1 = Integer.parseInt("10", 2);
        int b2 = Integer.parseInt("10", 8);
        int b3 = Integer.parseInt("10", 16);
        System.out.println(b + "\n" + b1 + "\n" + b2 + "\n" + b3);
        System.out.println("____________");
        String s = "H,.e  Ll&&O";
//        s.replace("[^a-zA-Z0-9]", "");
        System.out.println(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());

        System.out.println(isPalindrome("Was it a cat I saw?"));

//        [^a-zA-Z0-9] рег.выражение. Означает все разные символы кроме цифр и букв
//        s.replaceAll("[^a-zA-Z0-9]", "") - значит заменить [^a-zA-Z0-9] на ""
//        регулярное выражение (RegEx в Java) – это шаблон для поиска строки в тексте
        System.out.println("____________");
        calculateResult(2.0, 5.0);
        calculateResult(9, 2);
        Integer gg = 10;
        System.out.println(Integer.MAX_VALUE);
        fillAndPrintArray(new int [5]);
        System.out.println("------");
        System.out.println(incrementIfPositive(10));

        System.out.println("&&&&&&&&&");
        determineAdult(-1);
        System.out.println(determineAdult(17));
        System.out.println(determineAdult(18));
        System.out.println(determineAdult(22));
        System.out.println("_________");
        testCatchException(5,2);
        testCatchException(5,0);
    }
    static void testCatchException(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (RuntimeException e) {
            System.err.println("Ошибка! На ноль делить нельзя");
        }
    }
    public static boolean isPalindrome(String text) {
        // редактируем text - убираем из него лишние символы - все, кроме букв и цифр и приводим к все буквы к одному регистру:
        StringBuffer sb = new StringBuffer(text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        return sb.toString().equals(sb.reverse().toString());
    }

    public static boolean isPalindrome1(String text) {
        return text
                .replaceAll("[^a-zA-Z0-9]", "").toLowerCase()

                .equals(new StringBuffer
                        (text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())
                        .reverse().toString());
    }

    static void calculateResult(double x, double y) {
        System.out.println((double) x * y);
    }

    static void calculateResult(int x, int y) {
        System.out.println((double) x / (double) y);
    }

    static void fillAndPrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
            System.out.println(arr[i]);
        }
    }
    public void printArray(int[] array) {
        fillArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
    }
    public static int incrementIfPositive(int a) {
        return (a <= 0) ? a : ++a;
    }

    public static boolean determineAdult(int age) {
        if (age >= 18) {
            return true;
        } else if (0 < age) {
            return false;
        } else {
            System.out.println("Ошибка! Введите правильный возраст.");
            return false;
        }
        //Твой код здесь
    }
    static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] sum = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0 , sum, 0,  firstArray.length);
        System.arraycopy(secondArray, 0 , sum, firstArray.length,  secondArray.length);
        return sum;
    }
}
