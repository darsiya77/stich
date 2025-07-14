package Archive.Exception;

public class Example4 {
    public static void main(String[] args) {
        method1();
        method2();
    }
    public static void method1() {
        //не вызывает ничего
    }
    public static void method2() {
        method3();
        method4();
    }
    public static void method3() {
        //не вызывает ничего
    }
    public static void method4() {
        method5();
    }
    public static void method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
    }
}
