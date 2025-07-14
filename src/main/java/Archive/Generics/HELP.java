package Archive.Generics;

//https://youtu.be/bME9w3BIMoc?list=PLQ9NkV1-BDZ_WNhVqR_2uqfvt1dXy7Cgx&t=442



import java.util.ArrayList;
import java.util.List;

/*Нельзя создавать типизированные статичные поля при создании класса, т.к. статичные поля являются общими для
всех объектов этого класса, все объекты этого класса будут ей пользоваться, а как - не известно, что там за тип
данных.

 class Person <T> {
 static T t; - ошибка
 T t; - а такую можно
 }
 */
public class HELP {
    public static void main(String[] args) {
        int array[] = new int [] {1,2,3};
        ArrayList <String> list = new ArrayList<>();
        ArrayList <String> list2[] = new ArrayList[10];
        ArrayList <String> list3[] = (ArrayList<String>[])new ArrayList[10];// - вот так с приведением более правильно
        List<Integer> inti = new ArrayList<>();
    }
}
