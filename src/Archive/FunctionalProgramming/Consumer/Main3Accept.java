package Archive.FunctionalProgramming.Consumer;

// https://youtu.be/IVUVcdzcrcw?si=8XhZcYfEqGDRVPkB&t=464
// https://drive.google.com/file/d/1zjlHbNl30oIdcPtODKu_BmsC723JEhLa/view
// Пример использования побочного эффекта реализацией Consumer

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main3Accept {

    public static void main(String[] args) {

        List<String> result = new ArrayList<>();
        String s = "J";

        Consumer<String> cons1 = a -> {
            if (a.startsWith(s))
                result.add(a);
        };

        cons1.accept("Java");
        cons1.accept("Julia");
        cons1.accept("Python");
        System.out.println(result);
    }
}
