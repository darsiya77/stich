package Archive.Exception.Car;

import java.io.*;
public class Main {
    public static void main(String[] args) {
      try (Car car = new Car()) {
          car.drive();
      }
      catch (IOException ex) {
      }
    }
    public static class Car implements Closeable {
        @Override
        public void close() throws IOException {
            System.out.println("������ �����������...");
        }

        public void drive() {
            System.out.println("������ �������.");
        }
    }
}
   /* �������� ����������� ����� Car, ����� ������� ����� ���� ����� ���� ������������ � try-with-resources.
        ����� close() ������ �������� �� ����� ����� "������ �����������...".
        Try ������ ������ ��� ������������� ���������� � ������������ ��.
        � ������ main � ����� try ������ ����� drive(). ����� drive ������ �������� �� ����� ��������� "������ �������."

        ����������:
        1. ������� ������ ��������� ����������� ����� Car.
        2. ������� ������ ��������� ����� main.
        3. � ������� ������ �������������� try � ���������.*/