package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

public class InterF {
    interface A {
        default void myMethod() {
            System.out.println("A");
        }
    }

    interface B {
        default void myMethod() {
            System.out.println("B");
        }
    }
    interface D extends A,B {
        default void myMethod() {
            System.out.println("B");
        }
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        MyClass obj = new MyClass();
        obj.myMethod(); // A, B, MyClass
        String s = "ddf";
        MyClass jj = (MyClass) obj.clone();
    }
}


    class MyClass implements InterF.A, InterF.B, Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void myMethod() {
        InterF.A.super.myMethod(); // Вызов default метода из интерфейса A
        InterF.B.super.myMethod(); // Вызов default метода из интерфейса B
        System.out.println("MyClass");
    }

    public String prin(String str) {
        System.out.println("str");
        return str;
    }

    private int prin(int str) {
        System.out.println("str");
        return str;
    }

}