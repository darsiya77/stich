package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

public class Clone {
    public static void main(String[] args) {
        System.out.println(Integer.compare(2,2));
        Address address = new Address("New York");
        Person person1 = new Person("Alice", address);
        Person person2 = person1.clone();

        System.out.println(person1.address.city); // New York
        System.out.println(person2.address.city); // New York

        person2.address.city = "Los Angeles";
        System.out.println(person1.address.city); // New York (оригинал не изменился)
        System.out.println("______________________");

        StringBuilder sb = new StringBuilder("Alce");
        Man man1 = new Man(sb, 30);
        Man man2 = man1.clone();

        System.out.println(man1.name + " " + man1.age); // Alice 30
        System.out.println(man2.name + " " + man2.age); // Alice 30

        man2.name.delete(0,4).append("Bob");
        System.out.println(man1.name); // Alice (оригинал не изменился)
    }


}
    class Address implements Cloneable {
        String city;

        Address(String city) {
            this.city = city;
        }

                @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class Person implements Cloneable {
        String name;
        Address address;

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public Person clone() {
            try {
                Person cloned = (Person) super.clone();
                cloned.address = this.address.clone(); // Глубокое копирование
                return cloned;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class Man implements Cloneable {
    StringBuilder name;
    int age;

    Man(StringBuilder name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Man clone() {
        try {
            return (Man) super.clone(); // Вызов clone() из Object
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}


