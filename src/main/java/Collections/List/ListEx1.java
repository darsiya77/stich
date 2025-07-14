package Collections.List;

import java.util.ArrayList;
import java.util.List;


//в List элементы коллекции могут повтор€тьс€
//Ёлементы коллекции заполн€ютс€ по пор€дку

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();    // ArrayList<>() - одна из реализаций интерфейса List
        list.add(5);   // 0[5]
        list.add(7);   // 1[7]
        list.add(1, 9);   // 1[9], 7 сместилась на 2[7]
        list.set(1, 2);   // 1[2] - перезапись
        System.out.println("list.get(1): " + list.get(1));
        System.out.println("list.size = " + list.size());
        System.out.println("_________");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i): " + list.get(i));
            System.out.println("______");
            System.out.println(list);
        }
        System.out.println("______OF______");
        List<String> sL = List.of(" ол€", "ѕет€", "∆ен€", "яна");
        List<Integer> lis = new ArrayList<>();
        lis = List.of(1,2,3,4);
        ArrayList<Integer> ar = new ArrayList(lis);
        ar.add(7);
        System.out.println(lis);
        System.out.println(sL);
        System.out.println(ar);
    }
}

//ArrayList<>() - динамический массив, может измен€тьс€ в процессе выполнени€ программы. ƒефолт копасити = 10.

//метод list.add() - добавл€ет элемент на следующий незан€тый индекс
//list.add(1, 2) - делает вставку, сдвигает, на i индекс ставит х элемент, а прошлые значени€ сдвигает дальше
//list.set(1, 2) - перезависывает жлемент на заданный индекс
//list.get(1) - получение элемента по индексу