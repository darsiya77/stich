package Archive.FunctionalProgramming.Comparator;

// https://drive.google.com/file/d/12dhs8fX--Co9s3fNv9TmwcSs5ShqaYpP/view
// https://youtu.be/A-yrukWsGDg?si=mnhIP0fGayGfTLUJ&t=614

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 5);
        Cat cat5 = new Cat("Kuzia", 2);
        Cat[] cats = new Cat[] {cat1, cat2, cat3, cat4, cat5 };

//        Arrays.sort(cats, Comparator.comparingInt(Cat::getAge));
//        Arrays.sort(cats, Comparator.comparingInt(Cat::getAge).reversed());

        CatAgeComparator comp = new CatAgeComparator();
        Arrays.sort(cats, comp);

        System.out.println(Arrays.toString(cats));
    }
}
class CatAgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}
