package Archive.Generics;

//https://www.youtube.com/watch?v=2yeFSrcTQh8

import java.util.ArrayList;

public class WildCard {
    static class Fruit {
        int weight;
    }
    static class Citrus extends Fruit {
        int weiht;
    }
    static class Orange extends Citrus {
        int color;
    }
    static class BigRoundOrange extends Orange {
        int size = 100;
    }

//    ========================================  1  ====================================================
    private static int totalWeight (ArrayList<? extends Citrus> oranges) { // в классах, что бы читать из предков
        int weight = 0;                                                    // то есть дл€ продюссеров
        for (int i = 0; i < oranges.size(); i++) {                         // есть возможности по чтению
            weight += oranges.get(i).weight;                               // записывать нельз€
        }
        Fruit fruit = oranges.get(0);
//        oranges.add(new Citrus()); // compile-time error   Ќельз€ записывать, можно читать из предка
        return weight;
    }
    //    ========================================  2  ====================================================
    private static void addOrange(ArrayList<? super Orange> oranges) {  // в классах, что бы писать наследников
        for (int i = 0; i < 10; i++) {                                  // то есть дл€ консюмеров
            oranges.add(new Orange());                                  // есть возможности по записи
        }                                                               // прочесть только из Object

//        Citrus citrus = oranges.get(0);  // compile-time error   Ќельз€ читать, можно добавл€ть элементы
        Object object = oranges.get(0);    // можно прочесть только из ќбъекта
        oranges.add(new BigRoundOrange()); // можно добавл€ть элементы наследники
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();
        BigRoundOrange bigRoundOrange = new BigRoundOrange();

        citrus = orange;
        fruit = citrus;
        fruit = orange;

        ArrayList<Citrus> citrusList = new ArrayList<>();
        fruit = citrusList.get(0);
        citrus = citrusList.get(0);
        orange = (Orange)citrusList.get(0);


        ArrayList<Orange> orangeList = new ArrayList<>();
        totalWeight(orangeList);
        addOrange(orangeList);
        addOrange(citrusList);
        citrusList.add(new Orange());
        citrusList.add(new BigRoundOrange());
        citrusList.add(new Citrus());
//        citrusList.add(new Fruit());  // compile-time error



//        citrusList = orangeList; // compile-time error
    }
}
