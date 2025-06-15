package Archive.Anonimus;

public class External {
    // Анонимный класс наследуется от класса Foo
    static Foo foo = new Foo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Метод внутреннего анонимного класса");
        }
    };
    public static void main(String[] args) {
        foo.show();
    }
}

class Foo {
    public void show() {
        System.out.println("Метод суперкласса");
    }
}