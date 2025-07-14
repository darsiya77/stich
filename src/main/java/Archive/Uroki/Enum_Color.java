package Archive.Uroki;

public class Enum_Color {
    public static void main(String[] args) {
        Color col1 = Color.BLUE;
        System.out.println(col1.name()); // – вернет Enum значение
        System.out.println(col1.ordinal()); // – вернет индекс Enum значения
        System.out.println(Color.valueOf("RED")); // – позволяет получить значения перечисления по его строковому представлению.
    }
}
