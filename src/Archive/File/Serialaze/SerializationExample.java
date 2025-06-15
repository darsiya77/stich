package Archive.File.Serialaze;

import java.io.*;

class Person2 implements Serializable {
    private String name;
    private transient static int counter = 0;  // Статическое поле, которое не сериализуется стандартно

    public Person2(String name) {
        this.name = name;
    }

    // Переопределяем метод сериализации
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();  // Сериализация обычных полей
        out.writeInt(counter);  // Сериализация статического поля
    }

    // Переопределяем метод десериализации
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();  // Десериализация обычных полей
        counter = in.readInt();  // Восстановление статического поля
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', counter=" + counter + "}";
    }

    public static void incrementCounter() {
        counter++;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person2.incrementCounter();
        Person2 person = new Person2("John");

        // Сериализация объекта
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
            System.out.println("Объект сериализован");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person2 deserializedPerson = (Person2) in.readObject();
            System.out.println("Объект десериализован: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
