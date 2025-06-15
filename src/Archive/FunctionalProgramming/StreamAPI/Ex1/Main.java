package Archive.FunctionalProgramming.StreamAPI.Ex1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Phone> phoneStream1 = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream1.filter(p->p.getPrice()<50000)
                .forEach(p->System.out.println(p.getName()));

        System.out.println("___________");

        Stream<Phone> phoneStream2 = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream2
                .map(p-> "название: " + p.getName() + " цена: " + p.getPrice())
                .forEach(s->System.out.println(s));
    }
}
