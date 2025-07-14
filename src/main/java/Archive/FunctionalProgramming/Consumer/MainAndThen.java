package Archive.FunctionalProgramming.Consumer;

// https://youtu.be/IVUVcdzcrcw?si=9Qt_zix-WHsJkrI5&t=568
// https://drive.google.com/file/d/1zjlHbNl30oIdcPtODKu_BmsC723JEhLa/view
// Пример использования метода forEach

import java.util.function.Consumer;

public class MainAndThen {
    public static void main(String[] args) {


        Consumer<String> cons1 = a -> System.out.print("*" + a );

        Consumer<String> cons2 = a -> System.out.println("*");

        Consumer<String> result = cons1.andThen(cons2);

        result.accept("Hello");
    }
}
