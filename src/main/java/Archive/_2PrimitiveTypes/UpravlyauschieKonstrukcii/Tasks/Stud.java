package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

//https://www.youtube.com/watch?v=rhrd1sslUpw
// Как раотает оператор instanceof
// как работает ключевое слово super у наследников от класса родителя

public class Stud {
    public static void main(String[] args) {
        JavaStudent javaStudent = new JavaStudent();
        javaStudent.study();
        LazyStudent lazyStudent = new LazyStudent();
        System.out.println("__________LazyStudent____________");
        lazyStudent.study();
        Student student = new JavaStudent();
//        A a = (A) b;
//        LazyStudent lazyStudent2 = (LazyStudent) student;
    }
    public static class Student {
        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }

        void a() {
            System.out.println("HELLO!");
        }
    }
    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Прохожу курс по Java.");
        }

    }
    public static class LazyStudent extends Student {

        public LazyStudent() {
        }

        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }
}
