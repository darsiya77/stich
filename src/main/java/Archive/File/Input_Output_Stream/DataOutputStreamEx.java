package Archive.File.Input_Output_Stream;
//https://metanit.com/java/tutorial/6.7.php
//Класс DataOutputStream представляет поток вывода и предназначен для записи данных примитивных типов, таких, как int,
// double и т.д. Для записи каждого из примитивных типов предназначен свой метод:
//
//        writeBoolean(boolean v) : записывает в поток булевое однобайтовое значение
//
//        writeByte(int v): записывает в поток 1 байт, которые представлен в виде целочисленного значения
//
//        writeChar(int v): записывает 2-байтовое значение char
//
//        writeDouble(double v): записывает в поток 8-байтовое значение double
//
//        writeFloat(float v): записывает в поток 4-байтовое значение float
//
//        writeInt(int v): записывает в поток целочисленное значение int
//
//        writeLong(long v): записывает в поток значение long
//
//        writeShort(int v): записывает в поток значение short
//
//        writeUTF(String str): записывает в поток строку в кодировке UTF-8

import java.io.*;

public class DataOutputStreamEx {
    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        String str = "Andrey";
        // запись в файл
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeUTF(str);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        // обратное считывание из файла
        try (DataInputStream dos = new DataInputStream(new FileInputStream("data.bin"))) {
            // записываем значения
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