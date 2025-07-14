package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//сортирует элементы коллекции ПО КОМПАРАТОРУ (с функцией compare), если для данных объектов определен компаратор
//основан на структуре бинарного красно-черного дерева
// Любая реалтзация Set использует Map, но берет из нее только ключи

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("text");
        set.add("a");
        set.add("text1");
        set.add("zxsds");
        set.add("134");
        for (String s : set) {
            System.out.println(s);
        }
        // не может примениться Компаратор. Надо прописать в классе User компаратор, что бы  TreeSet знал как сортировать
        Set<User> setUser = new TreeSet<>();
    }
    class User {};
}
