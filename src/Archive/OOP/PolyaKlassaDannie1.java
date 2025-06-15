package Archive.OOP;

public class PolyaKlassaDannie1 { // Класс с модификатором public может быть только 1, а обычн. классов сколько угодно,
    // но имя класса с модификатором public должно совпадать с именем файла с расширением java
    public static void main(String[] args) {
        Personazh human1 = new Personazh();// Personazh() - конструктор.
        human1.name = "Andrey"; // получаем доступ к полям класса через точку
        human1.age = 30;// Хотя так на прямую обращаться к полям класса не правлиьно в программировании
        System.out.println("Меня зовут "+ human1.name+" и мне "+ human1.age+ " лет.");

        Personazh human2 = new Personazh(); // human1,2 - объекты класса Personazh;
        human2.name = "Anton";
        human2.age = 22;
        System.out.println("Меня зовут "+ human2.name+" и мне "+ human2.age+ " года.");


    }
}
class Personazh { // У класса могут быть:
    // 1. данные (поля)
    // 2. Действия, которые он может совершать (методы)
    String name;
    int age;
};
