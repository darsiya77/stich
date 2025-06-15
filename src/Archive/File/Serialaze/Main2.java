package Archive.File.Serialaze;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Объявляю массив животных
        Animal[] animals = new Animal[]{new Animal("A"), new Animal("B")};
        // Сериализую массив в файл хеллоу
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hello.txt"));
        oos.writeInt(2);
        oos.writeObject(animals);
        // Десериализую массив из файла хэллоу
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hello.txt"));
        Animal[] animals2 = new Animal[ois.readInt()];
        animals2 = (Animal[]) ois.readObject();
        // Вывожу на печать массив животных, который десериализовал
        System.out.println(Arrays.toString(animals2));
        System.out.println("________________________________________________");

        // Проверяю работу метода deserializeAnimalArray

        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        // Сериализую массив животных
        out.writeInt(2);
        out.writeObject(new Animal("A"));
        out.writeObject(new Animal("B"));
        // Получаем массив байт
        byte[] byteArrayOfAnimals = byteOut.toByteArray();
        System.out.println(Arrays.toString(deserializeAnimalArray(byteArrayOfAnimals)));

//_____________________________________________________________________________________________

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            Animal[] animals = new Animal[ois.readInt()];
            for (int i = 0; i < animals.length; i++) {
                animals[i] = (Animal) ois.readObject();
            }
            return animals;
        } catch (ClassNotFoundException | IOException e) {
            throw new IllegalArgumentException(e);
        }
//        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(data);
//        ObjectInputStream ois = new ObjectInputStream(byteStream1);
        //Твой код здесь
    }
//    Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal. Массив байт устроен
//    следующим образом. Сначала идет число типа int, записанное при помощи ObjectOutputStream.writeInt(size). Далее
//    подряд записано указанное количество объектов типа Animal, сериализованных при помощи
//    ObjectOutputStream.writeObject(animal).
//
//    Если вдруг массив байт не является корректным представлением массива экземпляров Animal, то метод должен бросить
//    исключение java.lang.IllegalArgumentException.
//
//    Причины некорректности могут быть разные. Попробуйте подать на вход методу разные некорректные данные и посмотрите,
//    какие исключения будут возникать. Вот их-то и нужно превратить в IllegalArgumentException и выбросить.
//    Если что-то забудете, то проверяющая система подскажет. Главное не глотать никаких исключений, т.е. не оставлять
//    нигде пустой catch.

}

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Animal " + name;
    }
}
