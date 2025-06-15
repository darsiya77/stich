package Archive.FunctionalProgramming.Supplier.HomeWork;

// https://youtu.be/cl12wAVFPrU?si=VoQaDPn_0GbPn0wJ
// https://drive.google.com/file/d/1SYu7Cum7mGWQypZTUzx6-HwlIhdruQUz/view
// метод T get()

import java.util.function.Supplier;

public class MainHW1 {
    public static void main(String[] args) {
        someClass some1 = new someClass("Hello world Java the best language");

        System.out.println(some1.get());
        System.out.println(some1.get());
        System.out.println(some1.get());
        System.out.println(some1.get());
        System.out.println(some1.get());
        System.out.println(some1.get());
        System.out.println(some1.get());
        System.out.println(some1.get());

        System.out.println("______");

        someClass some2 = new someClass("Stop doing this");
        System.out.println(some2.get());
        System.out.println(some2.get());
        System.out.println(some2.get());
        System.out.println(some2.get());
    }
}

class someClass implements Supplier<String> {
    String line;
    int index = 0;

    public someClass(String line) {
        this.line = line;
    }

    @Override
    public String get() {
        String[] arrayWords = this.line.split(" ");
        for (int i = index; ; ) {
            if (i == arrayWords.length) {
                index = 0;
                i = 0;
            }
            index += 1;
            return arrayWords[i];
        }
    }
}

/*
        1) Реализуйте с помощью класса Supplier<String> который будет при каждом вызове get()
        возвращать слово полученное из строки переданной в качестве параметра конструктору этого
        класса. Для упрощения задания выполните разбиение строки по символу пробел.
        */
