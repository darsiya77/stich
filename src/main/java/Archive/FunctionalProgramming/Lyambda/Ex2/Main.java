package Archive.FunctionalProgramming.Lyambda.Ex2;

// Доступ к внешним данным из лямбда функции
//https://youtu.be/ChTVknYsHeU?si=stEud2EOA8TSA72J&t=521
//https://drive.google.com/file/d/1FvFcyijJVyOEV7wCzxxvd6ojP9KRFvMf/view

public class Main {
    public static void main(String[] args) {

        SimpleClass a = new SimpleClass(new int[]{1, 2, 3});

        Summator sm = a.getSummatorInstance();

        System.out.println(sm.getsum());
    }
}
