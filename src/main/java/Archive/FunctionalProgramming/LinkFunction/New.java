package Archive.FunctionalProgramming.LinkFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class New {
    public static void main(String[] args) {
        // Ссылка на конструктор
        Supplier<Person> personSupplier = () -> new Person("John");
        Person person = personSupplier.get();
        System.out.println(person.getName()); // John

        // Использование метода референс для конструктора
        Function<String, Person> personFunction2 = Person::new;

        Person person2 = personFunction2.apply("Katya");
        System.out.println(person2.getName()); // null (или используйте другой конструктор)
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
