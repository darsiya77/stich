package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

public class Week {
    public static void main(String[] args) {
        String[] week = new String[]{"Пятница", "Суббота", "Среда", "Saturday", "Sunday", "Sunday"};
        System.out.println(weekendCount(week));
        System.out.println(weekdayCount(week));
        System.out.println(isWeekend("Saturday"));

    }

    public static boolean isWeekend(String weekday) {
        return ("Saturday".equalsIgnoreCase(weekday)) || ("Sunday".equalsIgnoreCase(weekday));
    }

    public static int weekendCount(String[] days) {
        int result = 0;
        for (int i = 0; i < days.length; i++) {
            result = (isWeekend(days[i])) ? result + 1 : result;
        }
        return result;
    }

    public static int weekdayCount(String[] days) {
        int result = 0;
        for (int i = 0; i < days.length; i++) {
            result = (isWeekend(days[i])) ? result : result + 1;
        }
        return result;
    }
}
