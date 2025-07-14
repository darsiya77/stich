package Archive.FunctionalProgramming.StreamAPI.Ex5_Accumulate;

// https://drive.google.com/file/d/1gAxZTWJUb-C13SYfHiUguavWfkUZZWXV/view
// https://youtu.be/K9xypx_LvRg?si=9YAalC31JkA7OZyz&t=1005
// Метод <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Ex5_3_Reduce {

    public static void main(String[] args) {

        List<Goods> list = List.of(new Goods("Apple", 50),
                new Goods("Orange", 70),
                new Goods("Pear", 65),
                new Goods("Cherry", 75));

        BiFunction<Integer, Goods, Integer> biFunc = (a, b) -> a + b.getPrice();

        BinaryOperator<Integer> biOp = (a, b) -> a + b;

        Integer totalSum = list.stream()
                .filter(a -> a.getPrice() > 65)
                .reduce(0, biFunc, biOp);

        System.out.println(totalSum);

//        В данном примере с помощью reduce выполняется суммирование стоимости товаров в потоке.
    }
}
class Goods {
    private String name;
    private int price;
    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Goods [name=" + name + ", price=" + price + "]";
    }
}
