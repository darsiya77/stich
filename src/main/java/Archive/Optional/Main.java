package Archive.Optional;

// https://youtu.be/s3DaG-XwYnM?si=PdWNTeKUeQdCT-Oc&t=211
// https://drive.google.com/file/d/1XMI2PwTp-O-ofHjll6-WyK7rxGRuRCdf/view

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "Black");
        Cat cat2 = new Cat("Barsic", "White");
        Cat cat3 = new Cat("Umka", "Grey");

        Cat cats[] = new Cat[] {cat1, cat2, cat3};

        // _____ 1._���� �� ��������� Optional, �� ������ �������� �� 0 (����� ���������� null, ���� �� ����� �������)____
        Cat findCat1 = findCatByName("Vaska", cats);

        if (findCat1 != null) {
            System.out.println("1). ��������� ������ ������ findCatByName: " + findCat1.getColor());
        }
        // _____ 2._���� �� ��������� Optional, � ����� ���������� ���������� �� ��������� ��� ������������_______________
        // ______������ �������� ��������� ���������� �������, ��� ������ �������� �� 0________________________________
        try {
            Cat findCat2 = findByNameEx("Vaskaa", cats);
            System.out.println("2). ��������� ������ ������ findByNameEx: " + findCat2.getName());
        } catch (NoSuchElementException e) {
            System.out.println("2). ��������� ������ ������ findByNameEx: ������ ������ � ������ - findByNameEx");

        }
        //___3)_��������� ������ - ��������� Optional - ��� ����� �������, ��� ��������� ����� ���� ���������__________
        //___����� ��������� ��� ������ � ��������� ��������. ���� ������ ������ ��� ����� - ����� ������������� ���
        // ��������� ����� ���� � ������������� � �� ������ �������� if ... �� ���� �� ������� ��������, �������
        // ����������, ��� ���� ������� - �.�. �� ������ null. ���������� ����� ����� � ��� �����, ��� ���������� get().
        // null - �� ����� ������������, �� �� ����� ������ � �� ������� ���������� ����������.

        Optional<Cat> result = findCatByNameOptional("Vaska", cats);
//        result.get();
        if (result.isPresent()) {
            Cat cat = result.get();
            System.out.println("3). ��������� ������ ������ findCatByNameOptional: " + cat.getName());
        } else {
            System.out.println("3). ��������� ������ ������ findCatByNameOptional: Cat not found");
        }
        System.out.println("4). ����� ��������!");
    }
//_______________________1)__������ ������ ��� ������ � ��������� null:________________________________________________
//    ���, ��� ���������� ������ ������� �� ������������, ��� ����� ����� ���� ���������, ��� ����� ��������� null
//    � ��� ���� ���� ������� - ������. ����� ���� null ������� � �����-�� ������ � NullPointerException �������, �����
//    ����� �� ��������� � ����� null, � ��� ����� ���� ������� �����!

    public static Cat findCatByName(String name, Cat[] cats) {
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        return null;
    }
//_______________________2)__������ ������ ������ � ���������� ����������:_____________________________________________
//    � ������ ������� ����� ���������� ����������
//    NoSuchElementException. � ���������� ���� ���������� ������������ �������� ����������.

    public static Cat findByNameEx(String name, Cat[] cats) throws NoSuchElementException {
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        throw new NoSuchElementException();
    }
    //_______________________3)__������ ������ ��� ������ � �������������� Optional:___________________________________
    // __�.�. ����� ���������� �� ��� ������, � ��������, ����� ��������� ���� �� ���-������ ������

    public static Optional<Cat> findCatByNameOptional(String name, Cat[] cats) {
        Cat result = null;
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                result = cat;
                break;
            }
        }
        return Optional.ofNullable(result);  // ����� ��������� ��������� � Optional ������, ������� ����� ���� null � �� null
    }
}
