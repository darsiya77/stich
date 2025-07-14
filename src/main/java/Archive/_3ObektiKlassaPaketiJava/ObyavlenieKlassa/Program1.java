package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa;// https://metanit.com/java/tutorial/3.14.php

public class Program1 {//---___---___---___---___---___---___---PROGRAM___---___---___---___---___---___---___---___---___

    public static void main(String[] args) {

        Person1 kate = new Person1("Kate");
        System.out.println(kate.getName());     // Kate
        changeName(kate);
        System.out.println(kate.getName());     // Alice
    }
    static void changeName(Person1 p){
        p.setName("Alice");
    }
}//---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---
class Person1{//---___---___---___---___---___---___---PERSON1___---___---___---___---___---___---___---___---___---___-

    private String name;                         // - 1 поле - переменная

    Person1 (String name){                       // - 2 поле - конструктор
        this.name = name;
    }
    public void setName(String name){            // - 3 поле - метод НЕвозвратный, принимает параметр (String перем.)
        this.name = name;
    }
    public String getName(){                     // - 4 поле - метод ВОЗВРАТНЫЙ, типа String, без параметров ()
        return this.name;
    }
}//---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---