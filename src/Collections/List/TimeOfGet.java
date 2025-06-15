package Collections.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfGet {
    public static void main(String[] args) {
        System.out.println(getTimOMsOffGet(fill(new ArrayList<>())));
        System.out.println(getTimOMsOffGet(fill(new LinkedList())));
    }
    private static List fill(List list) {
        for (int i = 0; i < 10_000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimOMsOffGet(List list) {
        Date startTime = new Date();
        get10000(list);
        Date endTime = new Date();                       // это время показывает окончание работы нашего метода get1000();
        long fin = endTime.getTime() - startTime.getTime();
        return fin;
    }
    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10_000; i++) {
            list.get(x);
        }
    }
}
