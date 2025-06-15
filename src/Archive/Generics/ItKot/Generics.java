package Archive.Generics.ItKot;

import Archive.Generics.ItKot.example.Example1;
import Archive.Generics.ItKot.example.Example2;
import Archive.Generics.ItKot.model.User;

public class Generics {
    public static void main(String[] args) {
        Example1<User> example1 = new Example1<>();
        System.out.println(example1.get());
        example1.set(new User("Alex",30));
        System.out.println(example1.get());
        System.out.println("___________");

        Example2.simpleInit(new User());

        Example2<User> example2 = Example2.init(new User());
        example2.set(new User("Alex", 30));
        System.out.println(example2.getInstance());
    }
}
