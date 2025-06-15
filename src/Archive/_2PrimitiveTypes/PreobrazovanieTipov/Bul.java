package Archive._2PrimitiveTypes.PreobrazovanieTipov;

public class Bul {
    public static void main(String[] args) {
        boolean b = false;                       // здесь прирвняли
        if (b=true){                             // код if будет выполняться только если в () будет true
            System.out.println("All right");
                                                // так как код 1, то можно sout не брать в {}


            boolean a = false;
            if (a==true)                         // сравнили (false равно true - нет не равно - false) код не выполнится
            System.out.println("Выражение тру");
            else                                 // иначе - то есть код после else выполняется, т.к. if - false
                System.out.println("Выражение Фолз");

            int x = 5;
            if (x<10)                           // внутри if () всегда должно быть лог.выр. = true/false
                                                // иначе будет ошибка компеляции.
                System.out.println(x);
        }
    }
}
