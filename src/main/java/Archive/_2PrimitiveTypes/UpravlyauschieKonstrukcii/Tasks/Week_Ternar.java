package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

public class Week_Ternar {
    public static void main(String[] args) {
        System.out.println(isWeekend("Sunday"));

    }

    public static String isWeeken(String weekday) {
//        return weekday.equalsIgnoreCase("Saturday") ||
//                weekday.equalsIgnoreCase("Sunday") ? "Ура, выходной!" : "Надо еще поработать";
        return "Saturday".equalsIgnoreCase(weekday) || "Sunday".equalsIgnoreCase(weekday) ? "Ура, выходной!" : "Надо еще поработать";
//        Saturday\|Sunday
    }

    public static boolean isWeekend(String weekday) {
        return ("Saturday".equalsIgnoreCase(weekday)) || ("Sunday".equalsIgnoreCase(weekday));
    }

    int weekendCount(String[] days) {
        int countWeekday = 0;
        for (int i = 0; i < days.length; i++) {
            if (isWeekend(days[i])) {
                countWeekday++;
            }
        }
        return countWeekday;
    }

    int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }
//    метод принимает массив строк и возвращает количество будних дней в этом массиве.
//    метод принимает массив строк и возвращает количество выходных дней в этом массиве.
}
