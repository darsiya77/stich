package Archive.Exception.Main;

// https://youtu.be/grgzoGXkIG4?si=hkGfH3LKiYhOhxZx&t=332

public class Main5 {
    public static void main(String[] args) {
        try {
            NumCheck.printResult(8);
        } catch (Exception ex) {
//            ex.printStackTrace();
        }
        System.out.println("��������� ���������� ���������");
        //throw new NumCheckExeption("������� �����");
    }
}
    class NumCheck {
        public static void printResult (int a) throws NumCheckExeption {
            if (a <= 5 && a >= 1) {
                System.out.println("������ ������� ���������!");
            }
            else
                throw new NumCheckExeption(a);
        }
    }
    class NumCheckExeption extends Exception {
        public NumCheckExeption(int a) {
            System.out.println("��������� ����� " + a +  " ����� �� �������");
        }
//        public NumCheckExeption(String discription) {
//            super(discription);
//        }
    }
    // 16 - ������ ����� � � ��� ����. �����, ���. ����������� ���������� ��� �������.
    // 25 - ������ ���� �����-���������� � ��� 2 ������������