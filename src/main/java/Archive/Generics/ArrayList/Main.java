package Archive.Generics.ArrayList;

//https://www.youtube.com/watch?v=ZYzmt4LLvD0

public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> lines = new DynamicArray<>();
        lines.add(1);
        lines.add(2);
        lines.add(3);
        lines.add(4);
        lines.add(5);
        lines.add(6);
//        lines.add(112);
//        lines.add(112);
//        lines.add(9004);
//        lines.add(785);
//        lines.add(5);
//        lines.add(12);
//        lines.add(444);
//        lines.add(1111);
//        lines.add(1113);
//        lines.add(5554);
//        lines.add(88855);
//        lines.add(16);
        System.out.println(lines);
        lines.remove(4);
        System.out.println(lines);
        lines.add(10);
        System.out.println(lines);
        lines.add(11);
        System.out.println(lines);

//        lines.get(10);
    }

}
