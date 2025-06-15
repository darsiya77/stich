package Archive.File.Serialaze;

import java.io.*;

class Person2 implements Serializable {
    private String name;
    private transient static int counter = 0;  // ����������� ����, ������� �� ������������� ����������

    public Person2(String name) {
        this.name = name;
    }

    // �������������� ����� ������������
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();  // ������������ ������� �����
        out.writeInt(counter);  // ������������ ������������ ����
    }

    // �������������� ����� ��������������
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();  // �������������� ������� �����
        counter = in.readInt();  // �������������� ������������ ����
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

        // ������������ �������
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
            System.out.println("������ ������������");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // �������������� �������
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person2 deserializedPerson = (Person2) in.readObject();
            System.out.println("������ ��������������: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
