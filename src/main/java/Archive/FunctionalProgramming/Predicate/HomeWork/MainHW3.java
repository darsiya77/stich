package Archive.FunctionalProgramming.Predicate.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainHW3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

//        Predicate<Cat> preCatAge = cat -> cat.getAge() < 5;

//        Predicate<Cat> preCatName = cat -> cat.getName().charAt(0) > 'C';

//        cats.removeIf(prCatAge.and(preCatName));


        cats.removeIf(chosenCat(15, 'C'));

        System.out.println(cats);
    }

    public static Predicate<Cat> chosenCat(Integer age, Character nameWith) {

        Predicate<Cat> preCatAge = cat -> cat.getAge() < age;

        Predicate<Cat> preCatName = cat -> cat.getName().charAt(0) > nameWith;

        return preCatAge.and(preCatName);
    }
}
/*
    ��������� ���������� Predicate<Cat> (� �������� Cat ����� ����� ������������ � ������) �
        ������ ��� ���������� �������, ���������� �������� �� ������ Cat ����� ������� �������
        ������ ������������� �������� (�������� ��� ��������), � ��� �� �������� ���� ����� �����
        (�������� ��� �� ��� ��������). �������� ���� ������ �������� ����� ��� 5, � ������ ��� 'C' ��
        ����� ������ Cat [name=Timka, age=4], Cat [name=Kuzia, age=2].*/
