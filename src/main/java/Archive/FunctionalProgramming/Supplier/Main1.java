package Archive.FunctionalProgramming.Supplier;

// https://youtu.be/cl12wAVFPrU?si=PeDBiIRW0x8ehylE&t=225
// https://drive.google.com/file/d/1SYu7Cum7mGWQypZTUzx6-HwlIhdruQUz/view
// метод T get()
// Реализация Supplier лямбда функцией и ссылкой на метод

import java.util.function.Supplier;

public class Main1 {
    public static void main(String[] args) {

        Supplier<Integer> sup1 = () -> (int) (Math.random() * 10);

        Supplier<Integer> sup2 = Main1::getRandomNumber;

        System.out.println(sup1.get());
        System.out.println(sup2.get());
    }
    public static Integer getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
