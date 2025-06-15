package Archive.Generics;

// ������������� ����������� ������������

public class GenConsDemo {
    static class Summation {
        private int sum;

        <T extends Number> Summation(T arg) {
            sum = 0;
            for (int i = 0; i <= arg.intValue(); i++)
                sum += i;
        }

        int getSum() {
            return sum;
        }
    }

    public static void main(String[] args) {
        Summation ob = new Summation(4.9f);
        System.out.println(ob.getSum());
    }
}
