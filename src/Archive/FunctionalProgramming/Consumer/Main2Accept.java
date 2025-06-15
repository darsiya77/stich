package Archive.FunctionalProgramming.Consumer;

// https://youtu.be/IVUVcdzcrcw?si=EBVM-zoYh45P6yhy&t=138
// https://drive.google.com/file/d/1zjlHbNl30oIdcPtODKu_BmsC723JEhLa/view
// Пример реализации Consumer с помощью лямбда функции и ссылки на метод

import java.util.function.Consumer;

public class Main2Accept {
    public static void main(String[] args) {

        Consumer<String> cons1 = (a) -> System.out.println("{" + a + "}");

        Consumer<String> cons2 = Main2Accept::simpePrinter;

        cons1.accept("Hello world");

        cons2.accept("Hello world");
    }
    public static <T> void simpePrinter(T operand) {
        System.out.println("{" + operand + "}");
    }
}
