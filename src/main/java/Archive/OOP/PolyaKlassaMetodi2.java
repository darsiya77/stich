package Archive.OOP;

public class PolyaKlassaMetodi2 {
    public static void main(String[] args) {
        Personazhi human1 = new Personazhi();
        human1.name = "Andrey";
        human1.age = 30;
        human1.speak();
    }

}
class Personazhi{
    String name;
    int age;
    void speak (){
        for(int i = 0; i<3;i++) // выводит 3 раза из-иза цикла фор
        System.out.println("Меня зовут"+ name +", мне "+ age+ " лет");// поял иметоды "знают" о существовании друг друга, точкой не надо связывать
    }
}

