package Archive.FunctionalProgramming.Consumer;

// https://youtu.be/IVUVcdzcrcw?si=EBVM-zoYh45P6yhy&t=138
// https://drive.google.com/file/d/1zjlHbNl30oIdcPtODKu_BmsC723JEhLa/view
// Пример реализации Consumer с помощью класса

import java.util.function.Consumer;

public class Main1 {
    public static void main(String[] args) {
        Consumer<String> cons1 = new HashCodePrinter<>();
        cons1.accept("Hello");
    }
}
class HashCodePrinter<T> implements Consumer<T> {
    @Override
    public void accept(T t) {
        System.out.println(t.hashCode());
    }
}
