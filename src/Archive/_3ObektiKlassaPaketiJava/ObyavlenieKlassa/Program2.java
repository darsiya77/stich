package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa;

public class Program2{//---___---___---___---___---___---___---PROGRAM___---___---___---___---___---___---___---___---___

    public static void main(String[] args) {

        Person2 kate = new Person2("Kate");
        System.out.println(kate.getName());     // Kate
        changePerson(kate);
        System.out.println(kate.getName());     // Kate - изменения не произошло
        // kate хранит ссылку на старый объект
    }
    static void changePerson(Person2 p){
        p = new Person2("Alice");    // p указывает на новый объект
        p.setName("Ann");                  // изменяется новый объект
    }
    static void changeName(Person2 p){
        p.setName("Alice");
    }
}//---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---
class Person2{//---___---___---___---___---___---___---PERSON___---___---___---___---___---___---___---___---___---___---

    private String name;

    Person2(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){

        return this.name;
    }
}//---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---