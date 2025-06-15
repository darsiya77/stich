package Archive.FunctionalProgramming.Supplier;

// https://youtu.be/cl12wAVFPrU?si=rdmIb54Ip6h9GK47&t=409
// https://drive.google.com/file/d/1SYu7Cum7mGWQypZTUzx6-HwlIhdruQUz/view
// метод T get()
// Применение Supplier в стандартной библиотеке в классе Optional, в методе T orElseGet(Supplier<? extends T> supplier) {...}

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {

        String[] names = new String[] { "Luke", "Darth", "Java","Obi-Wan", "R2D2", "Joke" };

        Optional<String> name = Optional.ofNullable(findNameByFirstLetter(names, "J"));


        String result = name.orElseGet(() -> "Name not found. May the force be with you.");

        System.out.println(result);
    }
    public static String findNameByFirstLetter(String[] names, String firstLetter) {
        for (String name : names) {
            if (name.startsWith(firstLetter)) {
                return name;
            }
        }
        return null;
    }
}
