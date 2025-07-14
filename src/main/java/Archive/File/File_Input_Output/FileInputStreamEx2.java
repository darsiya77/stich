package Archive.File.File_Input_Output;

import java.io.*;

public class FileInputStreamEx2 {
    public static void main(String[] args) throws Exception
    {
        //������� ������ FileInputStream, ����������� � ����� �c:/data.txt�.
        FileInputStream inputStream = new FileInputStream("hello.txt");
        long sum = 0;

        while (inputStream.available() > 0) //���� �������� ������������� �����
        {
            int data = inputStream.read(); //��������� ��������� ����
            sum += data; //�������� ��� � ����� �����
        }
        inputStream.close(); // ��������� �����

        System.out.println(sum); //������� ����� �� �����.
    }
}
