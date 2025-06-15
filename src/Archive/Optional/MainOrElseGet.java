package Archive.Optional;

// https://youtu.be/s3DaG-XwYnM?si=hjy7PXB0zCiQB5Qe&t=1057
// https://drive.google.com/file/d/1XMI2PwTp-O-ofHjll6-WyK7rxGRuRCdf/view
// Пример использования orElseGet

import java.util.Optional;

public class MainOrElseGet {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "Black");
        Cat cat2 = new Cat("Barsic", "White");
        Cat cat3 = new Cat("Umka", "Grey");

        Cat cats[] = new Cat[]{cat1, cat2, cat3};

        Optional<Cat> result = findCatByNameOptional("Vaskaь", cats);

        // метод orElseGet создает дефолтное значение и возвращает его, если в объекте Optional находится null

        Cat getCat = result.orElseGet(Cat::new);

        System.out.println(getCat);


    }
    public static Optional<Cat> findCatByNameOptional(String name, Cat[] cats) {
        Cat result = null;
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                result = cat;
                break;
            }
        }
        return Optional.ofNullable(result);  // метод позволяет упаковать в Optional ссылку, которая может быть null и не null
    }
}
