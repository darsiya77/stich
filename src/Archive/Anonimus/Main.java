package Archive.Anonimus;

public class Main {

    public static void main(String[] args) {

        int n=70;
        int m=30;
        Operation op = ()->{

            //n=100; - ��� ������ �������
            return m+n;
        };
        // n=100;  - ��� ���� ������
        System.out.println(op.calculate()); // 100
    }
    interface Operation{
        int calculate();
    }
}
