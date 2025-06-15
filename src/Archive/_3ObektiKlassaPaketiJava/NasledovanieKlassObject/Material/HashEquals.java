package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.Material;
// https://youtu.be/SMvI7QuV-qk
import java.util.Objects;

public class HashEquals {
    public static void main(String[] args) {
        Student a = new Student(1,"Bob");
        Student b = new Student(1,"Bob");
        Emplyee e = new Emplyee(1,"Bob");
        Emplyee2 i = new Emplyee2(1,"Bob");
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
        System.out.println("__________________________________");
        System.out.println(e.equals(a)); // выведет false - потому что не равны классы getClass() != o.getClass()) return false
        System.out.println(a.equals(e)); // выведет false - потому что не равны классы getClass() != o.getClass()) return false
        System.out.println(i.equals(a)); // выведет false в любом случае, т.к. Emplyee2 не наследуется от Student
        System.out.println(a.equals(i)); // выведет ошибку, т.к. нельзя сравнивать Student с Emplyee2, т.к. он не наследует у него
        System.out.println("___________________________________________");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(e.hashCode());
        System.out.println(i.hashCode());
    }
}
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        //super(); // можно прописать ключевое слово  super(), что бы передавал пустой конструктор, но смысла в этом нет
    }

    @Override
    public boolean equals(Object o) { // в equals передаем некий объект
        if (this == o) return true; // если ссылаемся на самого себя (то что и так уже было в equals ранее) если передадим самого себя
        if (o == null || getClass() != o.getClass()) return false; // объект равен 0 или класс (getClass) != классу объекта
        Student student = (Student) o; // проверка (сравнение) полей
        return id == student.id && Objects.equals(name, student.name); // здесь student - это (Object o); == для int
        // и сравнение через equals для строковой переменной. Если и 1 и 2 верно, то верни позитивный результат
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
class Emplyee extends Student {  // делаем что бы класс Emplyee (делаем его расширением) наследовался от класса Student

    public Emplyee(int id, String name) {
        super(id, name); // ключевое слово для того, что бы прописать пустой конструктор вместо this.id = id, name
    }
}
class Emplyee2 {
    int id;
    String name;
    public Emplyee2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}// если закомментировать строку 33, то выдаст ошибку после компеляции, т.к. Emplyee2 не наследует у Student