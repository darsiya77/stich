package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.StudentJava;

import java.util.Objects;

//https://www.youtube.com/watch?v=rhrd1sslUpw
/*��� �������� ������� ��������� ������ ���������� ��� ����������� ��� ���������� ��� ����������� �� ���������, ���. �����
������������ � ������� ������ ������ ���� �� ��������� ������� ������ ������������*/
public class Student {
    public static void main(String[] args) {
        JavaStudent jStudent= new JavaStudent();
        jStudent.study();
        Object g1 = new JavaStudent();
        ((JavaStudent)g1).jStudy();
        LazyStudent lStudent = new LazyStudent();
        lStudent.study();
    }
    protected final String studying;//  ����������

    protected Student(String work) {   // ����������� 1
        this.studying = work;
        //System.out.println("� �����������");
    }
    public Student() {                 // ����������� 2 (��� ����������)
        this.studying = "������� �������� �������.";
        //System.out.println("��� ����������");
    }
    public void study() {              // �����
        System.out.println("� ����� �����. " + studying);
    }
    public static class JavaStudent extends Student {
        public JavaStudent (){
            super("������� ���� �� Java.");// ����.��. super �������� ��� �� ������� ����������� � �����.��� ������
        }
        public void jStudy() {
            super.study();
        }
    }
    public static class LazyStudent extends Student {
        public LazyStudent() {

        }

        @Override
        public void study() {
            System.out.println("������� �� �����, ��� ����.");
        }

    }
}
/*
����: �������� ������ ����������
        ��� ����� �����:
        1. ��� ��������� ������� ����������� � Java
        2. �������� ����� super
        �������:
        ������� ����������, ��� � ��� ���� ��������, ��������� ������ �������:
public static class Student {
    protected final String studying;
    protected Student(String work) {
        this.studying = work;
    }
    public Student() {
        this.studying = "������� �������� �������.";
    }
    public void study() {
        System.out.println("� ����� �����. " + studying);
    }
}
    ������������ ������� ���������� �������. ��� �� ��� �������� ���� ����� ��������� ��� �� ������������ �� ���������� ����������� ��������.

        ������ �� ��� ������ ����� JavaStudent, ������� ����� ������� �� ����������� Java.*/
