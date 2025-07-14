package Archive.Exception.Test;

public class Test3 {
    public static void main(String[] args) {
        printClassAndMethodName();
        System.out.println("_______");
        printClassAndMethodName2();
        char c = '9' + '9';
        char a = '9';
        char b = 18;
        char f = 19;
        System.out.println((char)'9' + 10);
        System.out.println(c);
        System.out.println('9' + '9');
        System.out.println('9');
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println("___");
    }

    static void printClassAndMethodName() {
        // �������� ���� �������
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        // ������ ������� (������ 0) � ��� ����� getStackTrace(), ������ (������ 1) � ������� �����
        StackTraceElement currentMethod = stackTrace[1];

        String className = currentMethod.getClassName();
        String methodName = currentMethod.getMethodName();

        System.out.println("Class: " + className);
        System.out.println("Method: " + methodName);
    }

    static void printClassAndMethodName2() {
        // �������� ��� ������
        String className = Test3.class.getName();

        // �������� ��� �������� ������
        String methodName = new Throwable()
                .getStackTrace()[0] // ������� �����
                .getMethodName();

        System.out.println("Class: " + className);
        System.out.println("Method: " + methodName);
    }
}
