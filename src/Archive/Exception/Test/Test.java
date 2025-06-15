package Archive.Exception.Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("[0] - " + Arrays.toString(new Throwable().getStackTrace()));
        System.out.println("[1] - " + getCallerClassAndMethodName2());
        System.out.println("[2] - " + anotherMethod2());
        System.out.println("______________");

        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
        System.out.println("_______________");
        methodC();

    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

//    ___________________________________________________________________________
    private static String getCallerClassAndMethodName2() {
        return Arrays.toString(new Throwable().getStackTrace());
    }
    private static String anotherMethod2() {
        return getCallerClassAndMethodName2();
    }
    static void methodC() {
        // Получаем стек вызовов
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();

        // Выводим информацию о каждом кадре стека
        for (StackTraceElement element : stackTrace) {
            System.out.println("Class: " + element.getClassName() +
                    ", Method: " + element.getMethodName() +
                    ", File: " + element.getFileName() +
                    ", Line: " + element.getLineNumber());
        }
    }

//_________________________________________________________________________________

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] st = new Exception().getStackTrace();
        if (st.length < 3) {
            return null;
        } else {
            return st[2].getClassName() + "#" + st[2].getMethodName();
//            return Arrays.toString(new Exception().getStackTrace());
        }
    }

}

/*    Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший
данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший
getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.

Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить
класс и метод, откуда сообщение было залогировано.*/
