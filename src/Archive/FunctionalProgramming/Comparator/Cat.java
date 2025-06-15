package Archive.FunctionalProgramming.Comparator;

import java.util.Comparator;

public class Cat {
    private String name;
    private int age;
    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public Cat() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }

//    @Override
//    public int compareTo(Cat o) {
//        return Integer.compare(this.getAge(), o.getAge());
//    }
    //    @Override
//    public int compare(Cat o1, Cat o2) {
//
//        if (o1.getAge() > o2.getAge()) {
//            return 1;
//        }
//        if (o1.getAge() < o2.getAge()) {
//            return -1;
//        }
//        return 0;
//
//        return (o1.getAge() < o2.getAge()) ? -1 : ((o1.getAge() == o2.getAge()) ? 0 : 1);
//
//        return Integer.compare(o1.getAge(), o2.getAge());
//
//    }
}