package Archive.Exception.Main;

import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class Main9 {

    public static void main(String args[]) {
        FileReader fr = null;
        try {
            File f = new File("file.txt");
            fr = new FileReader(f);
            char [] array = new char[10];
            fr.read(array);   // ������ ����������� �������
            for(char c : array)
                System.out.print(c);   // ����� �������� �� �����, ���� �� �����
        }catch(IOException e1) {
            System.out.println("1");
            e1.printStackTrace();
        }finally {
            try {
                fr.close();
            }catch(IOException e2) {
                System.out.println("2");
                e2.printStackTrace();
            }
        }
    }
}
