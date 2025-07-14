package Archive.Exception.Main;

import java.util.Objects;

public class Main6 {
    public static void main(String[] args) {
        Object s = new Object();
        int a = 50000;
        byte b = 1;
        byte c = 0;
        c = (byte)a;
        b = (byte) s;
        System.out.println(c);
        System.out.println(b);
    }
}
