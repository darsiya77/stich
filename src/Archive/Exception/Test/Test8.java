package Archive.Exception.Test;
import java.io.*;

public class Test8 {

    public static void main(String args[]) {
        try {
            int array[] = new int[2];
            System.out.println("Доступ к третьему элементу:" + array[3]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение:" + e);
            e.printStackTrace();
        }
        System.out.println("Вне блока");
    }
}