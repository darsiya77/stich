package Archive.Exception.Test;
import java.io.*;

public class Test8 {

    public static void main(String args[]) {
        try {
            int array[] = new int[2];
            System.out.println("������ � �������� ��������:" + array[3]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("����������:" + e);
            e.printStackTrace();
        }
        System.out.println("��� �����");
    }
}