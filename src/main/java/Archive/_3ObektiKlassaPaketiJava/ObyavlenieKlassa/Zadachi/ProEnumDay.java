package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public class ProEnumDay {
    public static void main(String[] args) {
        Day day;
        day = Day.FRIDAY;
        System.out.println(Day.FRIDAY.getRusName() + " - " + Day.FRIDAY.isWeekend());
        System.out.println(Day.SUNDAY.meaning + " - " + Day.SUNDAY.vocationStatus);
        System.out.println(day.meaning);
    }
}
