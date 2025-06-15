package Archive.FunctionalProgramming.KataEx.Ex2;

public class Main {
    @FunctionalInterface
    public interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }
    public static NumberGenerator<? super Number> getGenerator() {
        return x -> x.intValue() > 0;
    }
}
//      �������� �������������� ��������� NumberGenerator, ����������������� ����� �������, ��� ��������� ������
//      ����������� ������ Number, ������� ����� boolean cond(T arg).
//
//      �������� � ������ public static NumberGenerator<? super Number> getGenerator() � ������� ������ ���������
//      ���������� NumberGenerator, ������� ���������� true, ���� ����� � int ����������� ������ 0.
//
//
//
//        ����������:
//
//        1. ������ ���� ����� public static NumberGenerator<? super Number> getGenerator()
//
//        2. ���������� ��� ����� ��� ��������������.
//
//        3. ��� ��������� ������ ���� "�"
//
//        4. ����� ������ ���������� ���������� ����������