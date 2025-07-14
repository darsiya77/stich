package Archive.Anonimus;

//https://youtu.be/ndnubpPzkNE?si=TsTXKgdL7pT3odTU

interface AbleToEat {
    public void eat();
}

public class Test2 {
    public static int count = 5;
    public static void main(String[] args) {
        AbleToEat animal = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating ...");
            }
            public void sleep() {
                System.out.println("Someone is sleeping");
            }
            public static int getCount() {
                return count;
            }
        };
        animal.eat();
        animal.eat();
    }
}
