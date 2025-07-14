package Archive.Anonimus;

public class External {
    // ��������� ����� ����������� �� ������ Foo
    static Foo foo = new Foo() {
        @Override
        public void show() {
            super.show();
            System.out.println("����� ����������� ���������� ������");
        }
    };
    public static void main(String[] args) {
        foo.show();
    }
}

class Foo {
    public void show() {
        System.out.println("����� �����������");
    }
}