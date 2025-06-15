package Archive.FunctionalProgramming.Lyambda.Ex3;

// Доступ из лямбда функции к статическому контексту
//https://youtu.be/ChTVknYsHeU?si=stEud2EOA8TSA72J&t=729
//https://drive.google.com/file/d/1FvFcyijJVyOEV7wCzxxvd6ojP9KRFvMf/view

public class Main {
    public static void main(String[] args) {

        MathUtilite.setArr(new int[]{3, 4, 5});

        System.out.println(MathUtilite.getSummator().getsum());
    }
}
