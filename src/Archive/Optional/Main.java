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

        // _____ 1._Если не пользуюсь Optional, то делаем проверку на 0 (метод возвращает null, если не нашел искомое)____
        Cat findCat1 = findCatByName("Vaska", cats);

        if (findCat1 != null) {
            System.out.println("1). Результат вызова метода findCatByName: " + findCat1.getColor());
        }
        // _____ 2._Если не пользуюсь Optional, и метод генерирует исключение мы вынуждены его обрабатывать_______________
        // ______Однако механизм обработки исключений тяжелее, чем просто проверка на 0________________________________
        try {
            Cat findCat2 = findByNameEx("Vaskaa", cats);
            System.out.println("2). Результат вызова метода findByNameEx: " + findCat2.getName());
        } catch (NoSuchElementException e) {
            System.out.println("2). Результат вызова метода findByNameEx: Ошибка поиска в методе - findByNameEx");

        }
        //___3)_Результат метода - экземпляр Optional - нам сразу говорят, что результат может быть неудачным__________
        //___далее проверяем что внутри и извлекаем значение. Этот подход делает код яснее - сразу предупреждают что
        // результат может быть и отрицательным и мы делаем проверку if ... но если не сделаем проверку, вылетит
        // исключение, что тоже неплохо - т.к. не получу null. Исключение будет сразу в той точке, где вызывается get().
        // null - не будет замаскирован, он не уйдет дальше и не вызовет отложенное исключение.

        Optional<Cat> result = findCatByNameOptional("Vaska", cats);
//        result.get();
        if (result.isPresent()) {
            Cat cat = result.get();
            System.out.println("3). Результат вызова метода findCatByNameOptional: " + cat.getName());
        } else {
            System.out.println("3). Результат вызова метода findCatByNameOptional: Cat not found");
        }
        System.out.println("4). Поиск завершен!");
    }
//_______________________1)__Пример метода для поиска с возвратом null:________________________________________________
//    Тот, кто пользуется данным методом не предупрежден, что поиск может быть неудачный, что будет возвращен null
//    и где этот ноль вылезет - вопрос. Может этот null добавят в какой-то список и NullPointerException выпадет, тогда
//    когда мы обратимся к этому null, а это может быть гораздо позже!

    public static Cat findCatByName(String name, Cat[] cats) {
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        return null;
    }
//_______________________2)__Пример метода поиска с генерацией исключения:_____________________________________________
//    В случае неудачи метод генерирует исключение
//    NoSuchElementException. В вызывающем коде необходимо обрабатывать подобное исключение.

    public static Cat findByNameEx(String name, Cat[] cats) throws NoSuchElementException {
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        throw new NoSuchElementException();
    }
    //_______________________3)__Пример метода для поиска с использованием Optional:___________________________________
    // __т.к. метод возвращает не сам объект, а оболочку, нужно проверять есть ли что-нибудь внутри

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
