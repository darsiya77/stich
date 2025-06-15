package Archive.FunctionalProgramming.Consumer.BiConsumer;

// https://youtu.be/IVUVcdzcrcw?si=B4OgBLj1-UMn2OE2&t=793
// https://drive.google.com/file/d/1zjlHbNl30oIdcPtODKu_BmsC723JEhLa/view
// Пример реализации BiConsumer

import java.util.function.BiConsumer;

public class MainAccept {

    public static void main(String[] args) {

        BiConsumer<String, Integer> biCons = (a, b) -> System.out.println(a.repeat(b));

        biCons.accept("Hello ", 3);
    }
}
