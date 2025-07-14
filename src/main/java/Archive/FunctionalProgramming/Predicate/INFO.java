package Archive.FunctionalProgramming.Predicate;

// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// https://youtu.be/rfVhHnxBdc0?si=itjxG6Jr9ymtYBWs

public @interface INFO {
}
//    boolean test(T t);

/*  Predicate<T> - �������������� ��������� ����������� � Java 8. ������������ ���
    �������� ���� ��� ����� �������. �������� ������� ���������� ��� ���������� ������
    (�������� ������ ��� ���������� ��������� ��� ���).*/

/*    boolean test(T t) ��������� ������������� �� ������ �� ������ t
    ��������� �������. ���� �� �� ����� ������ �������
        true, � ��������� ������ false.

default Predicate<T> and(Predicate<? super T> other) ���������� ��������� �������� (� ���� ��������
        ����������� �) �� ������ �������� � ���� ��� ���������
        ���������� other.

default Predicate<T> or(Predicate<? super T> other) ���������� ��������� �������� (� ���� ��������

        ����������� ���) �� ������ �������� � ���� ��� ���������
        ���������� other.

default Predicate<T> negate() ���������� �������� � ���� ����������� �� �� ���������

        �������� ���������

static <T> Predicate<T> not(Predicate<? super T> other) ���������� �������� � ���� ����������� �� �� ������
        ��������� ������������� � �������� ��������� other.
static <T> Predicate<T> isEqual(Object targetRef) ���������� ��������, ������� ���������, ����� �� ���
        ��������� �������� Objects.equals (Object, Object). ������
        � ������� ����� ������������ ������ ��������
        ���������� targetRef*/
