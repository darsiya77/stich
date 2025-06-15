package Collections.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfSet {
    public static void main(String[] args) {
        System.out.println(getTimOMsOfInsert(fill(new ArrayList<>())));
        System.out.println(getTimOMsOfInsert(fill(new LinkedList())));
    }
    private static List fill(List list) {
        for (int i = 0; i < 10_000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimOMsOfInsert(List list) {
        Date startTime = new Date();
        Set10000(list);
        Date endTime = new Date();                       // это время показывает окончание работы нашего метода get1000();
        long fin = endTime.getTime() - startTime.getTime();
        return fin;
    }
    public static void Set10000(List list) {
        int x = list.size() / 2;
        for (int i = 0; i < 10_000; i++) {
            list.set(x, new Object());
        }
    }
}
