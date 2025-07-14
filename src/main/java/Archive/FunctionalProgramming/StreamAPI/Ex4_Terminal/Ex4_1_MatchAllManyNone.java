package Archive.FunctionalProgramming.StreamAPI.Ex4_Terminal;

// https://drive.google.com/file/d/1uI3YLnwwBO3gOytfa4vnwOdKCDvAJ3Mt/view
/* boolean allMatch(Predicate<? super T> predicate) � ������ true � ��� ������ ���� ���
 �������� ������ ������������� ���������� Predicate.*/

import java.util.List;
import java.util.function.Predicate;

public class Ex4_1_MatchAllManyNone {
    public static void main(String[] args) {

        List<String> projectLanguages = List.of("Java", "Fortran", "C", "C++", "Python", "Ruby", "JS");

        List<String> iKnow = List.of("Java", "Fortran", "C", "Python");

        Predicate<String> predicate = check(iKnow);

        if (projectLanguages.stream().anyMatch(predicate)) {
            System.out.println("I can implement part of the task ");
        } else {
            System.out.println("I cant help ");
        }
        if (projectLanguages.stream().allMatch(predicate)) {
            System.out.println("I can implement the whole task");
        } else {
            System.out.println("I cannot complete the whole task");
        }
//        � ������ ���� ������ �����, ������� ������������ ����� ������ ����������������
//        ������� ������������ � ������� ������. � ������� ������ anyMath �����������
//        �������� ���� �� ���� �� ���� ������� ������ � ������ ������ ������� ���� �. � �
//        ������� ������ allMath ��� ��� �������� ������ ��������� � ���� ������.
    }

    public static <T> Predicate<T> check(List<T> list) {

        class CheckLanguage implements Predicate<T> {
            @Override
            public boolean test(T t) {
                for (T element : list) {
                    if (element.equals(t)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return new CheckLanguage();
    }
//    ��� ��������������� ����� ������� ���������� ���������� ���������� Predicate.
//    ���� ���������� ���� ������� ���� � ������ �� ������� true, � ��������� ������ false.
}
