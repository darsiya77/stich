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
    private static int totalWeight (ArrayList<? extends Citrus> oranges) { // � �������, ��� �� ������ �� �������
        int weight = 0;                                                    // �� ���� ��� �����������
        for (int i = 0; i < oranges.size(); i++) {                         // ���� ����������� �� ������
            weight += oranges.get(i).weight;                               // ���������� ������
        }
        Fruit fruit = oranges.get(0);
//        oranges.add(new Citrus()); // compile-time error   ������ ����������, ����� ������ �� ������
        return weight;
    }
    //    ========================================  2  ====================================================
    private static void addOrange(ArrayList<? super Orange> oranges) {  // � �������, ��� �� ������ �����������
        for (int i = 0; i < 10; i++) {                                  // �� ���� ��� ����������
            oranges.add(new Orange());                                  // ���� ����������� �� ������
        }                                                               // �������� ������ �� Object

//        Citrus citrus = oranges.get(0);  // compile-time error   ������ ������, ����� ��������� ��������
        Object object = oranges.get(0);    // ����� �������� ������ �� �������
        oranges.add(new BigRoundOrange()); // ����� ��������� �������� ����������
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
