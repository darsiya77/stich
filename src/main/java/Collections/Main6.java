package Collections;

import java.util.Arrays;
import java.util.List;

 class Main6 {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("Alice", "Bob");
        List<String> girlFriends = List.of("Lena", "Jenya", "Anya");

        String[]people = new String[]{"Anton", "Andrey"};
        List<String> friendsPeople= Arrays.asList(people);
        System.out.println(friends);
        System.out.println(girlFriends);
        System.out.println(friendsPeople);
        Person person = new Person();
        System.out.println(person.getId());
        System.out.println(person.getName());
        int z = 1;
        System.out.println(z);
        Dog dog = new Dog("Bobik", 2);
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.toString());
        System.out.println(dog.hashCode());
        System.out.println(dog.getClass());
    }
    static class Person {
        int id;
        String name;

        public Person() {
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
    static class Animal {
        String name;


        Animal(String name) {
            this.name = name;
        }
    }

    static class Dog extends Animal {
        int age;

        Dog(String name, int age) {
            super(name); // Обязательно использовать super
            this.age = age;
        }
    }

}
