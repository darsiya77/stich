package Archive.File.Input_Output_Stream;
//https://metanit.com/java/tutorial/6.7.php
//����� DataOutputStream ������������ ����� ������ � ������������ ��� ������ ������ ����������� �����, �����, ��� int,
// double � �.�. ��� ������ ������� �� ����������� ����� ������������ ���� �����:
//
//        writeBoolean(boolean v) : ���������� � ����� ������� ������������ ��������
//
//        writeByte(int v): ���������� � ����� 1 ����, ������� ����������� � ���� �������������� ��������
//
//        writeChar(int v): ���������� 2-�������� �������� char
//
//        writeDouble(double v): ���������� � ����� 8-�������� �������� double
//
//        writeFloat(float v): ���������� � ����� 4-�������� �������� float
//
//        writeInt(int v): ���������� � ����� ������������� �������� int
//
//        writeLong(long v): ���������� � ����� �������� long
//
//        writeShort(int v): ���������� � ����� �������� short
//
//        writeUTF(String str): ���������� � ����� ������ � ��������� UTF-8

import java.io.*;

public class DataOutputStreamEx {
    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        String str = "Andrey";
        // ������ � ����
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            // ���������� ��������
            dos.writeUTF(tom.name);
            dos.writeUTF(str);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        // �������� ���������� �� �����
        try (DataInputStream dos = new DataInputStream(new FileInputStream("data.bin"))) {
            // ���������� ��������
            String name = dos.readUTF();
            String str1 = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b ____\n %s",
                    name, age, height, married, str1);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

class Person {
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String n, int a, double h, boolean m) {
        this.name = n;
        this.height = h;
        this.age = a;
        this.married = m;
    }
}