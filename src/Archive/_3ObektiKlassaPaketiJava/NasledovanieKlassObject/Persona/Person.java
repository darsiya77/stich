package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.Persona;

class Person {

    String name; // - ����������
    public String getName(){ // �����
        return name;
    }

    public Person(String name){ // - �����������

        this.name=name;
    }

    public void display(){ // - �����

        System.out.println("Name: " + name);
    }
}
class Employee extends Person{
    public Employee(String name){
        super(name);    // ���� ������� ����� ���������� �����������
        //  �� ����������� ����� ������ ��� �������
    }
}
