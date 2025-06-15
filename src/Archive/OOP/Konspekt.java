package Archive.OOP;

public class Konspekt {
    public static void main(String[] args) {

        Person tom = new Person(); // создание объекта


        // изменяем имя и возраст
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();
    }
}
class Person{

    String name;    // имя
    int age;        // возраст
    void displayInfo(){
        System.out.printf("Привет, меня зовут "+ name+" мне "+ age + "лет.");
    }
}
/*Cоздайте public static (мы делаем класс статическим исключительно для корректной работы проверяющей системы)
класс Human, содержащий поля String name и int age.
У класса Human должен быть метод public void sayHello(), который выводит в консоль, “Привет, меня зовут {name},
мне {age} лет.”.
В методе main создайте объект класса Human, заполните его поля и вызовите метод sayHello().

        Требования:
        1. Класс Human должен иметь поля String name и int age
        2. В классе Human должен быть публичный конструктор конструирующий поля String name и int age
        3. Метод sayHello() не должен ничего возвращать
        4. В методе main должен быть создан объект класса Human
        5. Поля объекта должны быть заполнены
        6. У объекта класса Human должен быть вызван метод sayHello()
        7. Класс Human должен быть статическим, метод main находится вне этого класса*/
