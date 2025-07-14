package Archive;

public class Dni_nedeli {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
        ;
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday", "Sunday":
                return true;
            default:
                return false;
        }

    }
}
//Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"