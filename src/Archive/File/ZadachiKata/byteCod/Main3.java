package Archive.File.ZadachiKata.byteCod;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main3 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("notes.txt");
            Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);
            writer.write("�");
            writer.flush();
        } catch (IOException e) {
            System.out.println("������");
        }
        System.out.println("������!");

    }
}
