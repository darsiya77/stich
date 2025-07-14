package Archive.File.ZadachiKata;
import java.io.*;
import java.util.Arrays;

public class DeserializeAnimalArray {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        try (oos){
            oos.writeInt(3);
            oos.writeObject(new Animal("Fox"));
            oos.writeObject(new Animal("Wolf"));
            oos.writeObject(new Animal("Dog"));
        }
        System.out.println(Arrays.toString(baos.toByteArray()));
        System.out.println("_____________");
        System.out.println(Arrays.toString(deserializeAnimalArray(baos.toByteArray())));
    }
    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) {
//            int x = in.readInt();
            Animal[] animal3 = new Animal[in.readInt()];
            for (int i = 0; i < animal3.length; i++) {
                animal3[i] = (Animal) in.readObject();
            }
            return animal3;
        }
        catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException | ClassNotFoundException |  ClassCastException | IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
class Animal implements Serializable {

    private String kind;

    Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Animal (" + kind + ')';
    }
}
class Student implements Serializable {
    private String name;

    public Student(String name) {
        this.name = name;
    }
};
