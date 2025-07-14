package Archive.FunctionalProgramming.Lyambda.Ex2;

// Доступ к внешним данным из лямбда функции
//  Лямбда функция используемая в качестве поля
// Из лямбда функции могу получить доступ ко всем членам этого класса

public class SimpleClass {
    private int[] arr;
    private Summator sm = () -> {
        int sum = 0;
        for (int i = 0; i < this.arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    };

    public SimpleClass(int[] arr) {
        super();
        this.arr = arr;
    }

    public Summator getSummatorInstance() {
        return this.sm;
    }
}