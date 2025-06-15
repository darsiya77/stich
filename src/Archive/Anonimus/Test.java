package Archive.Anonimus;

//https://youtu.be/ndnubpPzkNE?si=TsTXKgdL7pT3odTU

class Animal {
    public void eat() {
        System.out.println("Animal is eating . . .");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal() {
            @Override
            public void eat() {
                System.out.println("Other animal is eating");
            }
            public void sleep() {
                System.out.println("Other animal is sleeping");
            }
        };
        animal1.eat();

    }
}