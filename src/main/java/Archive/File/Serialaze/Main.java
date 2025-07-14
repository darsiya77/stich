package Archive.File.Serialaze;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Name\tAge\tCity");
        System.out.println("Alice\t30\tNew York");
        System.out.println("Bob\t25\tLondon");

        byte myByte = -3;
        byte[] myArray = {-3};
        InputStream in = new ByteArrayInputStream(myArray);
        int myInt = in.read();
        System.out.println(myInt);
        System.out.println((char) myInt);
        System.out.println((byte) myInt);
        System.out.println(myInt | 0xff);

    }
}
