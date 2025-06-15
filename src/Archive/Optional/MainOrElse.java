package Archive.Optional;

// https://youtu.be/s3DaG-XwYnM?si=hjy7PXB0zCiQB5Qe&t=1057
// https://drive.google.com/file/d/1XMI2PwTp-O-ofHjll6-WyK7rxGRuRCdf/view
// ������ ������������� orElse

import java.util.Optional;

public class MainOrElse {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "Black");
        Cat cat2 = new Cat("Barsic", "White");
        Cat cat3 = new Cat("Umka", "Grey");

        Cat cats[] = new Cat[]{cat1, cat2, cat3};

        // ������� ���� ��-���������, ��� �� ������������ ��� � ������ orElse. ���������� ���� ������� ����
        // ��������� ������ ������ findCatByNameOptional ����� null

        Cat defaultCat = new Cat("Default name", "Default color");

        Optional<Cat> result = findCatByNameOptional("Vaska", cats);

        Cat cat = result.orElse(defaultCat);

        System.out.println(cat);

    }
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
