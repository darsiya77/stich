package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

public class AnimalMain {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.voice();
        Cat myCat = new Cat();
        myCat.voice();
//        System.out.println("Hi");
    }

    static class Animal {
        String s;
        public Animal() {
            System.out.println("ANIMAL");
        }
        public Animal(String s) {
            System.out.println("Animal constructor - public Animal(String s)");
            this.s = s;
        }

        void voice() {
            System.out.println("This is my voice from class Animal + s from Animal = " + this.s);
        }
    }

    static class Cat extends Animal {
//        String n;
        public Cat() {
            super("");
            System.out.println("CAT");

        }

        @Override
        void voice() {
            System.out.println(super.s);
        }
    }
}

