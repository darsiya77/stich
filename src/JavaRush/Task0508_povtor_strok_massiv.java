package JavaRush;

import java.util.Scanner;

public class Task0508_povtor_strok_massiv {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        strings = new String[6];
        String check;
        for (int i = 0; i < 6; i ++){
            strings[i] = inn.nextLine();
        }
        for (int i = 0; i < strings.length; i++){
            check = strings[i];
            if (check != null){
                for (int j = i + 1; j < strings.length; j++){
                    if (check.equals(strings[j])){
                        strings[i] = null;
                        strings[j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
/*
    В этой задаче тебе нужно:

        Считать 6 строк и заполнить ими массив strings.
        Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
        Примеры.

        Массив после чтения строк:
        {"Hello", "Hello", "World", "Java", "Tasks", "World"}
        Массив после удаления повторяющихся строк:
        {null, null, null, "Java", "Tasks", null}

        Требования:
        •	В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
        •	В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.*/
