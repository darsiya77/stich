package Archive.Generics.ItKot.example;

public class Example1 <T> {
    private T instance;

    public T get() {return instance;}

    public void set(T obj) {this.instance = obj;}
}
