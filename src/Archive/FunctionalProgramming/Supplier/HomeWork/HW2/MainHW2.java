package Archive.FunctionalProgramming.Supplier.HomeWork.HW2;

// https://youtu.be/cl12wAVFPrU?si=VoQaDPn_0GbPn0wJ
// https://drive.google.com/file/d/1SYu7Cum7mGWQypZTUzx6-HwlIhdruQUz/view
// ����� T get()

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainHW2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "world", "Java");
        Predicate<String> startsWithUpperCase = s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0));

        Supplier<String> supplier = MainHW2.filteredSupplier(list, startsWithUpperCase);

        System.out.println(supplier.get()); // "Hello"
        System.out.println(supplier.get()); // "Java"
        System.out.println(supplier.get()); // null
        System.out.println(supplier.get()); // null
        System.out.println(supplier.get()); // null
    }

    public static Supplier<String> filteredSupplier(List<String> list, Predicate<String> predicate) {
        // ������� �������� ��� ��������� ������
        final Iterator<String> iterator = list.iterator();

        return () -> {
            String result = null;

            // ���������� ��������, ���� �� ������ ���������� ��� �� �������� ������
            while (iterator.hasNext()) {
                String current = iterator.next();
                if (predicate.test(current)) {
                    result = current;
                    break;
                }
            }

            return result;
        };
    }
}

/*
2)
        ���������� Supplier<String> � ������� Predicate<String> ����������� ��������� ����������:
        ���������� �� List<String> ������ ������ ��������������� ���������� Predicate. �������� ����
        � ��� ���� ������ [�Hello�, �world�, �Java�], � Predicate ���������� true ������ ���� �����
        ���������� � ������� �����, ���� ���������� Supplier ������ ��������������� �������
        �Hello�, �Java� � ����� ���� ���������� null (����������� ���������� ��������).


���������� �������:
        1. filteredSupplier �����:
        - �������� ������ � ��������.
        - ������� �������� ��� ������.
        - ���������� ��������� Supplier, ������� ��� ������ ������ get() ���������� �������� �� ��� ���, ���� �� ������
          ������� ��������������� ���������.

        2. ��������:
        - ������������ ��� ����������������� ������� �� ������. ������ ����� supplier.get() ���������� �������� ������,
          ��������� ������������ ��������.

        3. ��������:
        - ��������� �������� ������ �� ������������ �������� (��������, ��������� ��������� �����).

          ����� ������ ��������� ��������� ����� �������� � ������������ ���������������� ������ � ���������. ������
          �������� get() ���������� ����� � ������� �������, ��� ������������ ��������� ���������.

 */