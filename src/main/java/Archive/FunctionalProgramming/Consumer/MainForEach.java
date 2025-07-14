package Archive.FunctionalProgramming.Consumer;

// https://youtu.be/IVUVcdzcrcw?si=9Qt_zix-WHsJkrI5&t=568
// https://drive.google.com/file/d/1zjlHbNl30oIdcPtODKu_BmsC723JEhLa/view
// Пример использования метода forEach

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Java", "Fortran", "Python"));

        Consumer<String> cons1 = a -> System.out.println(a);

        list.forEach(cons1);
    }
}
