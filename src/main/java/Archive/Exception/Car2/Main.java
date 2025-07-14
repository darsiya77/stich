package Archive.Exception.Car2;


public class Main {
    public static void main(String[] args) {

        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException e) {
        }
    }

    public static class Car implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("������ �����������...");
        }

        public void drive() {
            System.out.println("������ �������.");
        }
    }
}


    /*�������� ����������� ����� Car, ����� ������� ����� ���� ����� ���� ������������ � try-with-resources.
        ����� close() ������ �������� �� ����� ����� "������ �����������...".
        Try ������ ������ ��� ������������� ���������� � ������������ ��.
        � ������ main � ����� try ������ ����� drive(). ����� drive ������ �������� �� ����� ��������� "������ �������."*/
