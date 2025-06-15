package Archive.FunctionalProgramming.Lyambda.Ex4;

// Доступ из лямбда функции к локальным переменным
//https://youtu.be/ChTVknYsHeU?si=stEud2EOA8TSA72J&t=931
//https://drive.google.com/file/d/1FvFcyijJVyOEV7wCzxxvd6ojP9KRFvMf/view

public class Main {
    public static void main(String[] args) {

        Summator sm = getIntegerSummator(new int[] { 1, 2, 3 });

        System.out.println(sm.getSum());
    }
    public static Summator getIntegerSummator(int[] array) {
        Summator sm = () -> {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        };
        return sm;
    }
}
