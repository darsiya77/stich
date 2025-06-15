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
            System.out.println("������������ ����! ���� userName �� ������ ���� ������, � userAge ������ ���� �������������");
        } else {
            name = userName;
            age = userAge;
        }
    }
    String getNameAndAge(){
        if (name == null || age <= 0){
            return "���-�� ����� �� ���! ������� ������������ ��������� ������";
        } else {
            return "���� ����� " + name + ", ��� " + age + " ����";
        }
    }
}
