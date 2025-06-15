package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.StudentJava;

import java.util.Objects;

//https://www.youtube.com/watch?v=rhrd1sslUpw
/*ѕри создании объекта баозового класса вызываетс€ или конструктор без аргументов или конструктор по умолчанию, кот. будет
существовать в базовом классе только если не объ€влены никакие другие конструкторы*/
public class Student {
    public static void main(String[] args) {
        JavaStudent jStudent= new JavaStudent();
        jStudent.study();
        Object g1 = new JavaStudent();
        ((JavaStudent)g1).jStudy();
        LazyStudent lStudent = new LazyStudent();
        lStudent.study();
    }
    protected final String studying;//  переменна€

    protected Student(String work) {   // конструктор 1
        this.studying = work;
        //System.out.println("— параметрами");
    }
    public Student() {                 // конструктор 2 (без параметров)
        this.studying = "ѕрохожу тестовое задание.";
        //System.out.println("без параметров");
    }
    public void study() {              // метод
        System.out.println("я очень зан€т. " + studying);
    }
    public static class JavaStudent extends Student {
        public JavaStudent (){
            super("ѕрохожу курс по Java.");// ключ.сл. super испозуем что бы вызвать конструктор с парам.баз класса
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
            System.out.println("—егодн€ не учусь, мне лень.");
        }

    }
}
/*
÷ель: —оздание класса наследника
        „то нужно знать:
        1.  ак создавать классов наследников в Java
        2.  лючевое слово super
        «адание:
        ƒавайте представим, что у нас есть студенты, описанные данным классом:
public static class Student {
    protected final String studying;
    protected Student(String work) {
        this.studying = work;
    }
    public Student() {
        this.studying = "ѕрохожу тестовое задание.";
    }
    public void study() {
        System.out.println("я очень зан€т. " + studying);
    }
}
    де€тельность которых ограничена учением.  ак ты мог заметить этот класс описывает еще не поступившего на конкретное направление студента.

        —оздай на его основе класс JavaStudent, который будет учитьс€ на направлении Java.*/
