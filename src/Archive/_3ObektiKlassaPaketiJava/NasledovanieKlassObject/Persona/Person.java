package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.Persona;

class Person {

    String name; // - переменная
    public String getName(){ // метод
        return name;
    }

    public Person(String name){ // - конструктор

        this.name=name;
    }

    public void display(){ // - метод

        System.out.println("Name: " + name);
    }
}
class Employee extends Person{
    public Employee(String name){
        super(name);    // если базовый класс определяет конструктор
        //  то производный класс должен его вызвать
    }
}
