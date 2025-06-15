package Archive.Generics.ItKot.example;

public class Example2<T> {
    private T instance;
    private Example2() {}

    public static <T> void simpleInit (T instantiator) {}
    public static <T> Example2 <T> init (T instantiator) {return new Example2<T>();}

    public void set(T obj) {this.instance = obj;}

    public T getInstance() {return instance;}
}
