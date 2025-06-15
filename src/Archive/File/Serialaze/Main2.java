package Archive.File.Serialaze;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // �������� ������ ��������
        Animal[] animals = new Animal[]{new Animal("A"), new Animal("B")};
        // ���������� ������ � ���� ������
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hello.txt"));
        oos.writeInt(2);
        oos.writeObject(animals);
        // ������������ ������ �� ����� ������
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hello.txt"));
        Animal[] animals2 = new Animal[ois.readInt()];
        animals2 = (Animal[]) ois.readObject();
        // ������ �� ������ ������ ��������, ������� ��������������
        System.out.println(Arrays.toString(animals2));
        System.out.println("________________________________________________");

        // �������� ������ ������ deserializeAnimalArray

        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        // ���������� ������ ��������
        out.writeInt(2);
        out.writeObject(new Animal("A"));
        out.writeObject(new Animal("B"));
        // �������� ������ ����
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
        //���� ��� �����
    }
//    ���������� �����, ������� �� ����������� ������� ���� ����������� ������ �������� Animal. ������ ���� �������
//    ��������� �������. ������� ���� ����� ���� int, ���������� ��� ������ ObjectOutputStream.writeInt(size). �����
//    ������ �������� ��������� ���������� �������� ���� Animal, ��������������� ��� ������
//    ObjectOutputStream.writeObject(animal).
//
//    ���� ����� ������ ���� �� �������� ���������� �������������� ������� ����������� Animal, �� ����� ������ �������
//    ���������� java.lang.IllegalArgumentException.
//
//    ������� �������������� ����� ���� ������. ���������� ������ �� ���� ������ ������ ������������ ������ � ����������,
//    ����� ���������� ����� ���������. ��� ��-�� � ����� ���������� � IllegalArgumentException � ���������.
//    ���� ���-�� ��������, �� ����������� ������� ���������. ������� �� ������� ������� ����������, �.�. �� ���������
//    ����� ������ catch.

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
