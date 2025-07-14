package Archive.Uroki.vetvleniya;

public class DniNedeli {
    public static boolean isWeekend(String weekday){
        boolean bool = false;
        switch (weekday){
            case "Saturday":
                bool = true;
            case "Sunday":
                bool = true;
        }
        return bool;
    }
    public static void main(String[] args) {
        System.out.println(isWeekend("gf"));
    }
}
