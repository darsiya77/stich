package Archive.Uroki;

public class ClassPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Andrey",23);
        System.out.println(person1.getNameAndAge());
    }
}
class Person {
    private String name;
    private int age;

    void setNameAndAge(String userName, int userAge){
        if (userName.isEmpty() || userAge <= 0) {
            System.out.println("Некорректный ввод! Поле userName не должно быть пустым, а userAge должен быть положительным");
        } else {
            name = userName;
            age = userAge;
        }
    }
    String getNameAndAge(){
        if (name == null || age <= 0){
            return "Что-то пошло не так! Проверь корректность введенных данных";
        } else {
            return "Меня зовут " + name + ", мне " + age + " года";
        }
    }
}
