package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public class Test {
    public static void main(String[] args) {
        Direction direction = Direction.UP;
        int x = 3, y =3;
        System.out.print("Движение " + direction + ": (" + x + ", " + y + ") ");
        System.out.println("-> (" + x + ", " + y + ")");
        System.out.println("========================");
        System.out.println("Изначальные координаты: (X=" + x + ", Y=" + y + "), Направление: " + direction);
        System.out.println("Вижу цель - иду к ней:  (X=" + x + ", Y=" + y + ").");
        System.out.println("==================STEP_FORWARD====================================");
        System.out.println("Движение " + direction + ": (" + x + ", " + y + ")");
        System.out.println("-> " + "(" + x + ", " + y + ")");
//        A a = (A) b;

    }

}
