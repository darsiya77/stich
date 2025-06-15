package Archive.FunctionalProgramming.Lyambda.Ex5;

// Лямбда функции и обобщенные функциональные интерфейсы
//https://youtu.be/ChTVknYsHeU?si=stEud2EOA8TSA72J&t=1058
//https://drive.google.com/file/d/1FvFcyijJVyOEV7wCzxxvd6ojP9KRFvMf/view

public class Main {
    public static void main(String[] args) {
        Modificator<String> mod = (text) -> text.toUpperCase();
        System.out.println(mod.modification("hello"));
    }
}
